package Level_3.Exercise_1.model.interfaces;

public interface Startable {

   default void startEngine(){
       System.out.println("The vehicle does not have an engine. ");
   }
}