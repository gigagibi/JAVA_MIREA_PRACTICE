package PRAKTIKA13;

public class Item {
    private int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) throws NegativeCostException, BigCostException{
        if(cost < 0)
        {
            throw new NegativeCostException();
        }
        if(cost > 100_000)
        {
            throw new BigCostException();
        }
        this.cost = cost;

    }
}
