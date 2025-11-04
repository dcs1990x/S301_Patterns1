package Level_3.Exercise_1.model;

import Level_3.Exercise_1.model.interfaces.Brakeable;
import Level_3.Exercise_1.model.interfaces.Command;

public class BrakeCommand implements Command {

    private Brakeable brakeable;

    public BrakeCommand(Brakeable brakeable){
        this.brakeable = brakeable;
    }

    @Override
    public void execute(){
        brakeable.brake();
    }
}