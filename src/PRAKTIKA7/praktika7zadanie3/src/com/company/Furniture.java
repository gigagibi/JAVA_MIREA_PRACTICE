package PRAKTIKA7.praktika7zadanie3.src.com.company;
public abstract class Furniture {
    protected String name;
    protected int cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
