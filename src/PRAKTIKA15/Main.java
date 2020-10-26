package PRAKTIKA15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void doCommand(int operationNumber)
    {
        System.out.println(ptr.commands.get(operationNumber));
        ptr = ptr.transitions.get(operationNumber);
    }

    static State ptr;
    public static void main(String[] args) {
        ArrayList<State> list = new ArrayList<State>();

        HashMap<Integer, String> commands = new HashMap<Integer, String>();
        HashMap<Integer, State> transitions = new HashMap<Integer, State>();
        commands.put(0, "create_project");//1
        commands.put(1, "add_library");
        State s = new State();
        s.setCommands(commands);
        list.add(s);

        commands = new HashMap<Integer, String>();//2
        commands.put(0, "test");
        commands.put(1, "drop_bd");
        s = new State();
        s.setCommands(commands);
        list.add(s);

        commands = new HashMap<Integer, String>();//3
        commands.put(0, "drop_bd");
        commands.put(1, "add_library");
        s = new State();
        s.setCommands(commands);
        list.add(s);

        commands = new HashMap<Integer, String>();//4
        commands.put(0, "restart");
        commands.put(1, "deploy");
        s = new State();
        s.setCommands(commands);
        list.add(s);

        commands = new HashMap<Integer, String>();//5
        commands.put(0, "deploy");
        commands.put(1, "restart");
        s = new State();
        s.setCommands(commands);
        list.add(s);
        ///////////////////////////////////////////////////////////////////
        transitions.put(0, list.get(1));//1
        transitions.put(1, list.get(4));
        list.get(0).setTransitions(transitions);

        transitions = new HashMap<Integer, State>();
        transitions.put(0, list.get(2));//2
        transitions.put(1, list.get(3));
        list.get(1).setTransitions(transitions);

        transitions = new HashMap<Integer, State>();
        transitions.put(0, list.get(3));//3
        transitions.put(1, list.get(4));
        list.get(2).setTransitions(transitions);

        transitions = new HashMap<Integer, State>();
        transitions.put(0, list.get(2));//4
        transitions.put(1, list.get(4));
        list.get(3).setTransitions(transitions);

        transitions = new HashMap<Integer, State>();
        transitions.put(0, list.get(0));//5
        transitions.put(1, list.get(2));
        list.get(4).setTransitions(transitions);

        ptr = list.get(0);

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> codes = new ArrayList<Integer>();
        while(N != -1)
        {
            codes.add(N);
            N = Integer.parseInt(sc.nextLine());
        }
        for(int i = 0; i < codes.size(); i++)
        {
            doCommand(codes.get(i));
        }
    }
}
