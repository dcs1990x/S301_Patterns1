package Level_1.Exercise_1.model;

import java.util.Stack;

public class ChangesManager implements CommandHistory {

    private static ChangesManager instance;
    private Stack<Command> commands;

    private ChangesManager() {
        this.commands = new Stack<>();
    }

    public static ChangesManager getInstance() {
        if (instance == null) {
            instance = new ChangesManager();
        }
        return instance;
    }

    @Override
    public void addCommand(Command command){
        command.execute();
        commands.push(command);
    }

    @Override
    public void undoCommand(){
        if (!commands.isEmpty()) {
            Command cmd = commands.pop();
            cmd.undo();
        }
    }

    @Override
    public void getCommandHistory(){
        System.out.println("Getting commands list: " + System.lineSeparator());
        for (Command command : commands){
            System.out.print(command);
        }
        System.out.println();
    }
}