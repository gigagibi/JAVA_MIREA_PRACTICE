package PRAKTIKA23;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
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

    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    URI tasksURL = new URI("http://gitlessons2020.rtuitlab.ru:3000/tasks");
    URI reportsURL = new URI("http://gitlessons2020.rtuitlab.ru:3000/reports");
    HttpClient httpClient = HttpClient.newBuilder().build();
    static Pattern solvedTaskPattern = Pattern.compile("\\{\\n.+(\\d+),\\n.+\\n\\D+[^-\\d](-*\\d+\\.?\\d*)\"\\n.+"); //для выделения конкретного задания c одним числовым результатом
    //Pattern taskPattern = Pattern.compile("\\{\\n.+(\\d+),\\n.+\\n\\D+[^-\\d](-?\\d+\\.?\\d*)(\\D+[^-\\d])(-*\\d+\\.?\\d*)\"\\n.+"); //для выделения конкретного задания с выражением
    static Pattern mathPattern = Pattern.compile("([\\+\\-\\*\\/]?\\d+\\.?\\d*)\\s*([\\+\\-\\*\\/])\\s*([\\+\\-\\*\\/]?\\s*\\d+\\.?\\d*)"); //для математических выражений

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Worker worker = new Worker();


        ArrayList<Task> tasks = new ArrayList<>();
        ArrayList<Report> reports = new ArrayList<>();

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
            for(int i = 0; i < tasks.size(); i++)
            {
               String expression = tasks.get(i).getExpression();
               Matcher mathMatcher = mathPattern.matcher(expression);
               //tasks.get(i).setExpression(tasks.get(i).getExpression().replace(expression, String.valueOf(worker.solveMath(expression))));
            }

            ArrayList<Task> solvedTasks = gson.fromJson(dbSB.toString(), taskType);

            for(Task task : tasks)
            {
                if(!solvedTasks.contains(task) && solvedTasks != null)
                {
                    worker.sendReport(new Report(0, task.getId(), "Gudaev", worker.solveMath(task.getExpression())));
                    solvedTasks.add(task);
                }
                else if(solvedTasks != null)
                {
                    solvedTasks = new ArrayList<>();
                    worker.sendReport(new Report(0, task.getId(), "Gudaev", worker.solveMath(task.getExpression())));
                    solvedTasks.add(task);
                }
            }
            FileWriter writer = new FileWriter("src\\main\\java\\PRAKTIKA23\\db.json");
            writer.write(gson.toJson(solvedTasks));
        }
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
        return answer;
    }

    public Worker() throws URISyntaxException {
    }
}
