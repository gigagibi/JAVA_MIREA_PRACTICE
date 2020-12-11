package PRAKTIKA27;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class Main {
    static HttpClient httpClient = HttpClient.newBuilder().build();
    public static void main(String[] args) throws IOException, InterruptedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Worker worker = new Worker();
        Class<Worker> workerClass = Worker.class;
        Gson gson = new Gson();
        Type taskType = new TypeToken<ArrayList<Task>>(){}.getType();
        ArrayList<Task> tasks = gson.fromJson(getTasks(URI.create("http://gitlessons2020.rtuitlab.ru:3000/reflectionTasks")), taskType);
        for(Task task : tasks)
        {
            workerClass.getDeclaredMethod(task.getType(), Data.class).invoke(worker, task.getData());
            //System.out.println(task.toString());
        }
    }

    public static String getTasks(URI uri) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().GET().uri(uri).build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
