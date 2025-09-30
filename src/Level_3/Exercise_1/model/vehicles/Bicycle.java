package Level_3.Exercise_1.model.vehicles;

import Level_3.Exercise_1.model.interfaces.Acceleratable;
import Level_3.Exercise_1.model.interfaces.Brakeable;

public class Bicycle extends Vehicle implements Acceleratable, Brakeable {

    public Bicycle(String brand, String model){
        super(brand, model);
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