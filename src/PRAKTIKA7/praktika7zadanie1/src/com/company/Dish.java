package PRAKTIKA7.praktika7zadanie1.src.com.company;

public abstract class Dish {
    protected boolean isClean, isBroken, isFull;
    protected int depth;
    protected String name;

    public boolean getIsClean() {
        return isClean;
    }

    public boolean getIsBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public void setClean(boolean clean) {
        this.isClean = clean;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void broke()
    {
        isBroken = true;
    }

    void repair()
    {
        isBroken = false;
    }

    public abstract void fill(String F);

}
