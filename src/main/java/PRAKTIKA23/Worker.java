package PRAKTIKA23;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.math.MathContext;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Worker {

    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    URI tasksURL = new URI("http://gitlessons2020.rtuitlab.ru:3000/tasks");
    URI reportsURL = new URI("http://gitlessons2020.rtuitlab.ru:3000/reports");
    HttpClient httpClient = HttpClient.newBuilder().build();
    static Pattern mathPattern = Pattern.compile("([\\+\\-\\*\\/]?\\d+\\.?\\d*)\\s*([\\+\\-\\*\\/])\\s*([\\+\\-\\*\\/]?\\s*\\d+\\.?\\d*)"); //для математических выражений

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Worker worker = new Worker();
        ArrayList<Task> tasks = new ArrayList<>();

        while(true)
        {
            StringBuilder dbSB = new StringBuilder();
            String line = null;
            BufferedReader reader = new BufferedReader(new FileReader("src\\main\\java\\PRAKTIKA23\\db.json"));
            while((line = reader.readLine()) != null)
            {
                dbSB.append(line).append("\n");
            }
            reader.close();
            Thread.sleep((long) new Random().nextFloat()*2000+1);
            Type taskType = new TypeToken<ArrayList<Task>>(){}.getType();
            Type reportType = new TypeToken<ArrayList<Report>>(){}.getType();
            tasks = gson.fromJson(worker.getTasks(), taskType);


            ArrayList<Task> solvedTasks = gson.fromJson(dbSB.toString(), taskType);

            for(Task task : tasks)
            {
                if(solvedTasks != null) {
                    if (!(solvedTasks.contains(task))) {
                        worker.sendReport(new Report(0, task.getId(), "Gudaev", worker.solveMath(task.getExpression())));
                        solvedTasks.add(task);
                    }
                }
            }
            if(solvedTasks != null)
            {
                FileWriter writer = new FileWriter("src\\main\\java\\PRAKTIKA23\\db.json");
                writer.write(gson.toJson(solvedTasks));
                writer.close();
            }
        }
        //Worker worker = new Worker();
        //worker.deletes(239, 442);
    }

    public String getTasks() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().GET().uri(tasksURL).build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public void sendReport(Report report) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(gson.toJson(report))).uri(reportsURL).setHeader("Content-Type", "application/json").build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Отчет отправлен");
    }

    public double solveMath(String problem)
    {
        double answer = 0;
        String symbol = null;
        double a = -1, b = -1;
        Matcher matcher = mathPattern.matcher(problem);
        if(matcher.find())
        {
            a = Float.parseFloat(matcher.group(1));
            symbol = matcher.group(2);
            b = Float.parseFloat(matcher.group(3));
        }
        if(symbol.contains("+"))
            answer = a+b;
        else if(symbol.contains("-"))
            answer = a-b;
        else if(symbol.contains("*"))
            answer = a*b;
        else if(symbol.contains("/"))
            answer = a/b;
        double scale = Math.pow(10, 2);
        return (Math.round((answer) * scale)) / scale;
    }

    public Worker() throws URISyntaxException {
    }

    public void deletes(int start, int end) throws IOException, InterruptedException {
        for(int id = start; id <= end; id++)
        {
            HttpRequest request = HttpRequest.newBuilder().DELETE().uri(URI.create("http://gitlessons2020.rtuitlab.ru:3000/reports/" + id)).build();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        }

    }
}
