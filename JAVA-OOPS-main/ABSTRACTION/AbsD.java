/*Create an abstract class called Vehicle with properties color and fuelType. 
Add an abstract method startEngine(). 
Derive two classes Car and Motorcycle from Vehicle. 
Implement the startEngine() method in each derived 
class to print a message indicating the vehicle type and engine start. 
Use abstraction to ensure that the startEngine() 
method is implemented in each derived class.*/

abstract class Vechile{
	String color;
	String fuel;
	void startEngine(){
		
	}
}
class car extends Vechile{
	void startEngine(){
		color="WHITE";
		fuel="GAS";
		System.out.println("CAR COLOR IS "+color+" FUELTYPE IS "+fuel);
	}
}
class motorCycle extends Vechile{
	void startEngine(){
		color="BLACK";
		fuel="PETROL";
		System.out.println("CAR COLOR IS "+color+" FUELTYPE IS "+fuel);
	}
}
class AbsD{
	public static void main(String args[]){
		Vechile v=new car();
		Vechile m=new motorCycle();
		v.startEngine();
		m.startEngine();
	}
}