package PRAKTIKA23;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Worker {

    URI tasksURL = new URI("http://gitlessons2020.rtuitlab.ru:3000/tasks");
    URI reportsURL = new URI("http://gitlessons2020.rtuitlab.ru:3000/reports");
    HttpClient httpClient = HttpClient.newBuilder().build();

    public static void main(String[] args) throws URISyntaxException, InterruptedException, IOException {
        Gson gson = new Gson();
        BufferedReader reader;
        Worker worker = new Worker();
        String task = worker.getTask();
        while(true)
        {
            //reader = new BufferedReader(new FileReader("src\\main\\java\\PRAKTIKA23\\db.json"));
            Random r = new Random();
            long sleepTime = (long) (r.nextFloat()*2000 + 1);
            Thread.sleep(sleepTime);
            Pattern taskExcept = Pattern.compile("\\{\n");

            Pattern pattern = Pattern.compile("\"-*\\d+\\D+[^-\\d]-*\\d+\"");
            Matcher matcher = pattern.matcher(task);
            int answer = -1;
            if(matcher.find())
            {
                answer = worker.solveMath(matcher.group(0));
            }
        System.out.println(task);
            System.out.println(answer);
        }
    }

    public String getTask() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().GET().uri(tasksURL).build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public void sendReport(String report) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(report)).uri(reportsURL).setHeader("Content-Type", "application/json").build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Отчет отправлен");
    }

    public int solveMath(String problem)
    {
        int answer = 0;
        String symbol = null;
        int a = -1, b = -1;
        Pattern pattern = Pattern.compile("(\"-*\\d+)(\\D+[^-\\d])(-*\\d+\")");
        Matcher matcher = pattern.matcher(problem);
        if(matcher.find())
        {
            a = Integer.parseInt(matcher.group(1).replace("\"", ""));
            symbol = matcher.group(2);
            b = Integer.parseInt(matcher.group(3).replace("\"", ""));
        }
        if(symbol.contains("+"))
            answer = a+b;
        else if(symbol.contains("-"))
            answer = a-b;
        else if(symbol.contains("*"))
            answer = a*b;
        else if(symbol.contains("/"))
            answer = a/b;
        return answer;
    }

    public Worker() throws URISyntaxException {
    }
}
