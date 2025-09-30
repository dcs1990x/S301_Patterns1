package Level_3.Exercise_1.model;

import Level_3.Exercise_1.model.interfaces.Acceleratable;
import Level_3.Exercise_1.model.interfaces.Command;

public class AccelerateCommand implements Command {

    private Acceleratable acceleratable;

    public AccelerateCommand(Acceleratable acceleratable){
        this.acceleratable = acceleratable;
    }

    @Override
    public void execute(){
        acceleratable.accelerate();
    }
}