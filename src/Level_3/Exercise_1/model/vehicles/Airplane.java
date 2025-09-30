package Level_3.Exercise_1.model.vehicles;

import Level_3.Exercise_1.model.interfaces.Acceleratable;
import Level_3.Exercise_1.model.interfaces.Brakeable;
import Level_3.Exercise_1.model.interfaces.Startable;

public class Airplane extends Vehicle implements Startable, Acceleratable, Brakeable {

    public Airplane(String brand, String model){
        super(brand, model);
    }

    @Override
    public void startEngine(){
        System.out.println("The plane's engine is turn on. ");
    }

    @Override
    public void accelerate(){
        System.out.println("The plane is accelerating. ");
    }

    @Override
    public void brake(){
        System.out.println("The plane is reducing its speed. ");
    }
}