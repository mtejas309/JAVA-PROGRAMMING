/*Create a base class called Vehicle with properties color and fuelType and a method startEngine().
 Derive two classes Car and Motorcycle from Vehicle. 
 Implement the startEngine() method in each derived
  class to print a message indicating the vehicle type and engine start. */



class Vechile{
    public String color;
    public String fuelType;
    


    void startEngine(){
        System.out.println("ENGINE IS HEART OF VECHILE");
    }

}

class Car extends Vechile{

   public void startEngine(){
    super.startEngine();
        color="BLACK";
        fuelType="ELECTRIC";
        System.out.println("CAR STARTS SMOOTHLY");
        System.out.println("color is "+color+" fuel type is "+fuelType);

    }

}

class Bike extends Vechile{

    void startEngine(){
        
        color="WHITE";
     fuelType="PETROL";
      System.out.println("BIKES ARE MONSTER");
      System.out.println("color is "+color+" fuel type is "+fuelType);

    }

}


public class InheritanceB {
    public static void main(String[] args) {
        Car c=new Car();
        c.startEngine();
        Bike b=new Bike();
        b.startEngine();
      
    }
    
}

