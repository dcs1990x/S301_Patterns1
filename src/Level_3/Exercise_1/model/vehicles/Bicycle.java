package Level_3.Exercise_1.model.vehicles;

import Level_3.Exercise_1.model.interfaces.*;

public class Bicycle implements Acceleratable, Brakeable {
    private String brand, model;

    public Bicycle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void accelerate(){
        System.out.println("The bicycle is accelerating. ");
    }

    @Override
    public void brake(){
        System.out.println("The bicycle is reducing its speed. ");
    }
}