package Level_1.Exercise_1;

import Level_1.Exercise_1.model.ChangesManager;
import Level_1.Exercise_1.model.Command;
import Level_1.Exercise_1.model.PrintCommand;
import java.util.Scanner;

public class RunMain {

    public static void run(){

        Scanner scanner = new Scanner(System.in);
        ChangesManager changesManager = ChangesManager.getInstance();

        for (int i = 0; i < 3; i++){
            String message = PrintCommand.askUser(scanner);
            Command command = new PrintCommand(message);
            changesManager.addCommand(command);
        }

        changesManager.getCommandHistory();
        changesManager.undoCommand();
        changesManager.getCommandHistory();
    }
}