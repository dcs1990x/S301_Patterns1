package Level_3.Exercise_1;

import Level_3.Exercise_1.model.*;
import Level_3.Exercise_1.model.interfaces.*;
import Level_3.Exercise_1.model.vehicles.*;

public class RunMain {

    public static void run(){

        Car car1 = new Car("Toyota", "Celica");
        Bicycle bicycle1 = new Bicycle("Giant", "BMX100");
        Airplane airplane1 = new Airplane("Boeing", "747");
        Ship ship1 = new Ship("Harland and Wolff", "RMS Titanic");

        VehicleControlSystem vcs = new VehicleControlSystem();

        System.out.println("Car actions: ");
        vcs.setCommand(new StartCommand(car1)); vcs.pressButton();
        vcs.setCommand(new AccelerateCommand(car1)); vcs.pressButton();
        vcs.setCommand(new BrakeCommand(car1)); vcs.pressButton();

        System.out.println("Bicycle actions: ");
        vcs.setCommand(new AccelerateCommand(bicycle1)); vcs.pressButton();
        vcs.setCommand(new BrakeCommand(bicycle1)); vcs.pressButton();

        System.out.println("Airplane actions: ");
        vcs.setCommand(new StartCommand(airplane1)); vcs.pressButton();
        vcs.setCommand(new AccelerateCommand(airplane1)); vcs.pressButton();
        vcs.setCommand(new BrakeCommand(airplane1)); vcs.pressButton();

        System.out.println("Ship actions: ");
        vcs.setCommand(new StartCommand(ship1)); vcs.pressButton();
        vcs.setCommand(new AccelerateCommand(ship1)); vcs.pressButton();
        vcs.setCommand(new BrakeCommand(ship1)); vcs.pressButton();
    }
}