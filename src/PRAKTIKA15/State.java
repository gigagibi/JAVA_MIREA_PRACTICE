package PRAKTIKA15;

import java.util.HashMap;

public class State {

    HashMap<Integer, String> commands = new HashMap<Integer, String>();
    HashMap<Integer, State> transitions = new HashMap<Integer, State>();

    public State(HashMap<Integer, String> commands, HashMap<Integer, State> transitions) {
        this.commands = commands;
        this.transitions = transitions;
    }

    public HashMap<Integer, String> getCommands() {
        return commands;
    }

    public void setCommands(HashMap<Integer, String> commands) {
        this.commands = commands;
    }

    public HashMap<Integer, State> getTransitions() {
        return transitions;
    }

    public void setTransitions(HashMap<Integer, State> transitions) {
        this.transitions = transitions;
    }
}
