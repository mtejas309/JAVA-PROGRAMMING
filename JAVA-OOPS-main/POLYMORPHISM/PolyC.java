/*Create a base class called Vehicle with a method drive(). 
Derive two classes Car and Motorcycle from Vehicle. 
Implement the drive() method in each derived 
class to print a specific driving message. 
Create a function called testDrive() that takes a Vehicle 
object as a parameter and calls the drive() method on it. 
Demonstrate polymorphism by passing both a 
Car object and a Motorcycle object to the testDrive() function.*/

class Vechile{
    void drive(){
        System.out.println("VECHILES ARE ANOTHER LOVE LIFE");

    }
}

class Car extends Vechile{
    void drive(){
        super.drive();
        System.out.println("CARS DRIVE CRAZY");



    }

}

class Bike extends Vechile{
    void drive(){
     
        System.out.println("BIKES DRIVE MADLY");

    }

}
class TestDrive {
    static void testDrive(Vechile vehicle) {
        vehicle.drive();
    }
}
class PolyC{
    public static void main(String[] args) {
        Car c = new Car();
        Bike m = new Bike();
        TestDrive.testDrive(c);
        TestDrive.testDrive(m);


       

    }
}
