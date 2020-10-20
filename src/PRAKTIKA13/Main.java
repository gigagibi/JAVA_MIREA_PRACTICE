package PRAKTIKA13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{

        Item item = new Item();
        try{
            int cost = Integer.parseInt(new Scanner(System.in).nextLine());
            item.setCost(cost);
            System.out.println("Cost is: " + cost);
        }
        catch (NegativeCostException nce) {
            System.out.println("Cost is negative!");
        }
        catch(NumberFormatException nfe) {
            System.out.println("Incorrect input");
        }
        catch(BigCostException bce)
        {
            System.out.println("Cost is too big!");
        }
        catch(Exception ex)
        {
            System.out.println("Error occured");
        }
        finally {
            System.out.println(item);
        }

        throw new BigCostException(); //от RuntimeException
    }
}
