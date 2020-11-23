package PRAKTIKA23;

public class Report {
    private int id, taskId;
    private String worker;
    private double result;

    public Report(int id, int taskId, String worker, double result) {
        this.id = id;
        this.taskId = taskId;
        this.worker = worker;
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public double getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
}
