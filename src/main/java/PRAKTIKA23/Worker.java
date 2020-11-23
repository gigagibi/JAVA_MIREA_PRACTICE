package PRAKTIKA23;

import com.google.gson.Gson;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Worker {

    URI tasksURL = new URI("http://gitlessons2020.rtuitlab.ru:3000/tasks");
    URI reportsURL = new URI("http://gitlessons2020.rtuitlab.ru:3000/reports");
    HttpClient httpClient = HttpClient.newBuilder().build();
    String workerName = "Gudaev";

    public static void main(String[] args) throws URISyntaxException, InterruptedException, IOException {
        Gson gson = new Gson();

        BufferedReader reader;
        Worker worker = new Worker();
        String taskList = worker.getTask();
        StringBuilder db = new StringBuilder();
        Pattern solvedTaskPattern = Pattern.compile("\\{\\n.+(\\d+),\\n.+\\n\\D+[^-\\d](-*\\d+\\.?\\d*)\"\\n.+"); //для выделения конкретного задания c одним числовым результатом
        Pattern taskPattern = Pattern.compile("\\{\\n.+(\\d+),\\n.+\\n\\D+[^-\\d](-?\\d+\\.?\\d*)(\\D+[^-\\d])(-*\\d+\\.?\\d*)\"\\n.+"); //для выделения конкретного задания с выражением
        Pattern mathPattern = Pattern.compile("\"(-?\\d+\\.?\\d*)(\\D+[^-\\d])(-*\\d+\\.?\\d*)\""); //для математических выражений
        while(true)
        {
            String id, taskId, result;
            reader = new BufferedReader(new FileReader("src\\main\\java\\PRAKTIKA23\\db.json"));
            String line;
            while((line = reader.readLine()) != null)
            {
                db.append(line);
                db.append("\n");
            }
            reader.close();
            Random r = new Random();
            long sleepTime = (long) (r.nextFloat()*2000 + 1);
            Thread.sleep(sleepTime);
            taskList = worker.getTask();

            ArrayList<String> tasks = new ArrayList<>();

            Matcher taskPatternMatcher = taskPattern.matcher(taskList);
            if(taskPatternMatcher.find())
            {
                for(int i = 1; i <= taskPatternMatcher.groupCount(); i++)
                {
                    tasks.add(taskPatternMatcher.group(i));
                }
            }

            for(int i = 0; i < tasks.size(); i++)
            {

                Matcher mathMatcher = mathPattern.matcher(tasks.get(i));
                double answer = -1;
                if (mathMatcher.find()) {
                    answer = worker.solveMath(mathMatcher.group());
                }
                String solvedTask = mathMatcher.replaceAll("\"" + answer + "\"");
                tasks.set(i, solvedTask);
            }

            StringBuilder taskSolved = new StringBuilder();
            for(String task : tasks)
            {
                taskSolved.append(task);
                taskSolved.append("\n");
            }
            if(!taskSolved.toString().equals(db.toString()))
            {
                FileWriter writer = new FileWriter("src\\main\\java\\PRAKTIKA23\\db.json");
                writer.write(taskSolved.toString());
                writer.close();
                StringBuilder reportBuilder = new StringBuilder();
                for(int i = 0; i < tasks.size(); i++)
                {

                }
            }
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

    public double solveMath(String problem)
    {
        double answer = 0;
        String symbol = null;
        double a = -1, b = -1;
        Pattern pattern = Pattern.compile("(\"-*\\d+)(\\D+[^-\\d])(-*\\d+\")");
        Matcher matcher = pattern.matcher(problem);
        if(matcher.find())
        {
            a = Float.parseFloat(matcher.group(1).replace("\"", ""));
            symbol = matcher.group(2);
            b = Float.parseFloat(matcher.group(3).replace("\"", ""));
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
