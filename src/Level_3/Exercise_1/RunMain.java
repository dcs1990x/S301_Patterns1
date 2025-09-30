package Level_3.Exercise_1;

import Level_3.Exercise_1.model.AccelerateCommand;
import Level_3.Exercise_1.model.BrakeCommand;
import Level_3.Exercise_1.model.VehicleControlSystem;
import Level_3.Exercise_1.model.StartCommand;
import Level_3.Exercise_1.model.interfaces.*;
import Level_3.Exercise_1.model.vehicles.*;

public class RunMain {

    public static void run(){

        Vehicle car1 = new Car("Toyota", "Celica");
        Vehicle bicycle1 = new Bicycle("Giant", "BMX100");
        Vehicle airplane1 = new Airplane("Boeing", "747");
        Vehicle ship1 = new Ship("Harland and Wolff", "RMS Titanic");

        VehicleControlSystem pms = new VehicleControlSystem();

        System.out.println("Car actions: ");
        pms.setCommand(new StartCommand((Startable) car1)); pms.pressButton();
        pms.setCommand(new AccelerateCommand((Acceleratable) car1)); pms.pressButton();
        pms.setCommand(new BrakeCommand((Brakeable) car1)); pms.pressButton();

        System.out.println("Bicycle actions: ");
        pms.setCommand(new AccelerateCommand((Acceleratable) bicycle1)); pms.pressButton();
        pms.setCommand(new BrakeCommand((Brakeable) bicycle1)); pms.pressButton();

        System.out.println("Airplane actions: ");
        pms.setCommand(new StartCommand((Startable) airplane1)); pms.pressButton();
        pms.setCommand(new AccelerateCommand((Acceleratable) airplane1)); pms.pressButton();
        pms.setCommand(new BrakeCommand((Brakeable) airplane1)); pms.pressButton();

        System.out.println("Ship actions: ");
        pms.setCommand(new StartCommand((Startable) ship1)); pms.pressButton();
        pms.setCommand(new AccelerateCommand((Acceleratable) ship1)); pms.pressButton();
        pms.setCommand(new BrakeCommand((Brakeable) ship1)); pms.pressButton();
    }
}