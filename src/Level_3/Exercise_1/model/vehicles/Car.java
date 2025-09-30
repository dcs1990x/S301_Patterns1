package Level_3.Exercise_1.model.vehicles;

import Level_3.Exercise_1.model.interfaces.Acceleratable;
import Level_3.Exercise_1.model.interfaces.Brakeable;
import Level_3.Exercise_1.model.interfaces.Startable;

public class Car extends Vehicle implements Startable, Acceleratable, Brakeable {

    public Car(String brand, String model){
        super(brand, model);
    }

    @Override
    public void startEngine(){
        System.out.println("The car's engine is turn on. ");
    }

    @Override
    public void accelerate(){
        System.out.println("The car is accelerating. ");
    }

    @Override
    public void brake(){
        System.out.println("The car is reducing its speed. ");
    }
}