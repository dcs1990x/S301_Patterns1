package Level_1.Exercise_1;

import Level_1.Exercise_1.model.ChangesManager;
import Level_1.Exercise_1.model.Command;
import Level_1.Exercise_1.model.PrintCommand;
import java.util.Scanner;

public class RunMain {

    public static void run(){

        Scanner scanner = new Scanner(System.in);
        ChangesManager changesManager = ChangesManager.getInstance();

        String message1 = PrintCommand.askUser(scanner);
        Command command1 = new PrintCommand(message1);
        changesManager.addCommand(command1);

        String message2 = PrintCommand.askUser(scanner);
        Command command2 = new PrintCommand(message2);
        changesManager.addCommand(command2);

        String message3 = PrintCommand.askUser(scanner);
        Command command3 = new PrintCommand(message3);
        changesManager.addCommand(command3);

        changesManager.getCommandHistory();
        changesManager.undoCommand();
        changesManager.getCommandHistory();
    }
}