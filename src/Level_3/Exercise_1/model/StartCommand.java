package Level_3.Exercise_1.model;

import Level_3.Exercise_1.model.interfaces.Command;
import Level_3.Exercise_1.model.interfaces.Startable;

public class StartCommand implements Command {

    private final Startable startable;

    public StartCommand(Startable startable){
        this.startable = startable;
    }

    @Override
    public void execute(){
        startable.startEngine();
    }
}