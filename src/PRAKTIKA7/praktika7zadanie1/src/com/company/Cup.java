package PRAKTIKA7.praktika7zadanie1.src.com.company;

public class Cup extends Dish {
    private String drinkName;

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public void drink()
    {
        isClean = false;
        isFull = false;
    }

    @Override
    public void fill(String F) {
        drinkName = F;
        isClean = false;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "drinkName='" + drinkName + '\'' +
                ", isClean=" + isClean +
                ", isBroken=" + isBroken +
                ", isFull=" + isFull +
                ", depth=" + depth +
                ", name='" + name + '\'' +
                '}';
    }
}
