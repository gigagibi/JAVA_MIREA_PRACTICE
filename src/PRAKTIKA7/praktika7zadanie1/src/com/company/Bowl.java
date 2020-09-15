package PRAKTIKA7.praktika7zadanie1.src.com.company;

public class Bowl extends Dish{
    private String soupName;

    public String getSoupName() {
        return soupName;
    }

    public void setSoupName(String soupName) {
        this.soupName = soupName;
    }


    public void eat()
    {
        isClean = false;
        isFull = false;
    }

    @Override
    public void fill(String F) {
        soupName = F;
        isClean = false;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "soupName='" + soupName + '\'' +
                ", isClean=" + isClean +
                ", isBroken=" + isBroken +
                ", isFull=" + isFull +
                ", depth=" + depth +
                ", name='" + name + '\'' +
                '}';
    }
}
