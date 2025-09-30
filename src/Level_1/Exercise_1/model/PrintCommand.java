package Level_1.Exercise_1.model;

import java.util.Scanner;

public class PrintCommand implements Command {
    private String message;

    public PrintCommand(String message) {
        this.message = message;
    }

    @Override
    public String getCommandName() {
        return "Print: " + message;
    }

    @Override
    public void execute() {
        System.out.println("[Executed:] " + message);
    }

    @Override
    public void undo() {
        System.out.println("[Undid:] " + message);
    }

    public static String askUser(Scanner scanner){
        System.out.print("Type a message: ");
        return scanner.nextLine() + "\n";
    }

    public String toString(){
        return getCommandName();
    }
}