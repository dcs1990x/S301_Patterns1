package Level_3.Exercise_1.model;

import Level_3.Exercise_1.model.interfaces.Command;

public class VehicleControlSystem {

    private Command command;

    public void setCommand(Command command){this.command = command;}
    public void pressButton(){command.execute();}
}