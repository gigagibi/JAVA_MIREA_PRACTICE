package PRAKTIKA23;

import java.util.Objects;

public class Task {
    private int id;
    private String taskDescription, expression;

    public Task(int id, String taskDescription, String expression) {
        this.id = id;
        this.taskDescription = taskDescription;
        this.expression = expression;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return getId() == task.getId() &&
                Objects.equals(getTaskDescription(), task.getTaskDescription()) &&
                Objects.equals(getExpression(), task.getExpression());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTaskDescription(), getExpression());
    }
}
