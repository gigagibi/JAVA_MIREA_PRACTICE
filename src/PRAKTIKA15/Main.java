package PRAKTIKA15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void doCommand(int operationNumber)
    {
        ptr = ptr.transitions.get(operationNumber);
        System.out.println(pointer.commands.get(operationNumber));
    }

    public static void setUp()
    {

    }
    static State ptr;
    public static void main(String[] args) {
        ArrayList<State> list = new ArrayList<State>();

        HashMap<Integer, String> commands = new HashMap<Integer, String>();
        HashMap<Integer, State> transitions = new HashMap<Integer, State>();

        commands.put(0, "add_library");
        commands.put(1, "restart");

        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        while(N != -1)
        {
            doCommand(N);
        }
    }
}
