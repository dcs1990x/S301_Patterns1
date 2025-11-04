package Level_3.Exercise_1.model.vehicles;

import Level_3.Exercise_1.model.interfaces.*;

public class Airplane implements Startable, Acceleratable, Brakeable {
    private String brand, model;

    public Airplane(String brand, String model){
        this.brand = brand;
        this.model = model;
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