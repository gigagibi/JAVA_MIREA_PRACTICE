package PRAKTIKA27;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Main {
    static HttpClient httpClient = HttpClient.newBuilder().build();
    public static void main(String[] args) throws IOException, InterruptedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Worker worker = new Worker();
        Class<Worker> workerClass = Worker.class;
        Gson gson = new Gson();
        Type taskType = new TypeToken<ArrayList<Task>>(){}.getType();
        ArrayList<Task> tasks = gson.fromJson(getTasks(URI.create("http://gitlessons2020.rtuitlab.ru:3000/reflectionTasks")), taskType);
        List<Method> workerMethods = Arrays.stream(workerClass.getDeclaredMethods())
                .filter(m -> Arrays.stream(m.getAnnotations()).anyMatch(a -> a instanceof WorkerAnnotation))
                .collect(Collectors.toList());
        for(Task task : tasks)
        {
            getByAnnotationName(workerMethods, task.getType()).invoke(worker, task.getData());
        }
    }

    public static String getTasks(URI uri) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().GET().uri(uri).build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public static Method getByAnnotationName(List<Method> methods, String aName)
    {
        for(Method method : methods)
        {
            if(method.getAnnotation(WorkerAnnotation.class).name().equals(aName))
            {
                return method;
            }
        }
        return null;
    }
}
