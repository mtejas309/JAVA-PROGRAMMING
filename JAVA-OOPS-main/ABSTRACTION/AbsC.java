/*Create an abstract class called Employee with properties name and salary. 
Add an abstract method calculateBonus(). Derive two classes Manager and Developer from Employee. 
Implement the calculateBonus() method in each derived class to 
calculate the bonus based on the salary. Use abstraction to ensure 
that the calculateBonus() method is implemented in each derived class.*/
abstract class Employee{
	String name;
	int salary;
	void calculateBonus(){
		
	}
}
class Manager extends Employee{
	void calculateBonus(){
		name="TEJAS M";
		salary=120000;
		int bonus=(salary/100);
		int s=bonus+salary;
		System.out.println("SALARY OF MANAGER IS "+s);
		
	}
}
class Developer extends Employee{
	void calculateBonus(){
		name="SPOORTHI GS";
		salary=1300000;
		int bonus=(salary/100);
		int s=bonus+salary;
		System.out.println("SALARY OF DEVELOPER IS "+s);
	}
}
class AbsC{
	public static void main(String args[]){
		Employee e=new Manager();
		Employee f=new Developer();
		e.calculateBonus();
		f.calculateBonus();
		
	}
}