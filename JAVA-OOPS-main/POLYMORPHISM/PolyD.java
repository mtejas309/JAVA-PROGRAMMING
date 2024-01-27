/*Create a base class called Employee with a method calculateSalary(). 
Derive two classes Manager and Developer from Employee. 
Implement the calculateSalary() method in each derived class to 
calculate the salary based on the role 
(e.g., managers receive a fixed bonus, developers receive a salary based on hours worked). 
Use polymorphism to create objects of Manager and Developer and call the calculateSalary() 
method on each object. */
import java.util.Scanner;
class Employee{
    Scanner s=new Scanner(System.in);
    String name;
    int salary;
   void calculateSalary(){

   }
}


class Devloper extends Employee{
    void calculateSalary(){
        System.out.println("ENTER YOUR NAME DEVELOPER");
        name=s.nextLine();
        System.out.println("ENTER YOUR SALARY");
       int salary=s.nextInt();
        if(salary>50000){
            double bonus=(salary*12/100);
            System.out.println("BONUS IS "+bonus);
            double total=bonus+salary;
            System.out.println("TOTAL SALARY OF THE DEVELOPERR IS "+total);

   }
}

}

class Manager extends Employee{
    void calculateSalary(){
        
          System.out.println("ENTER YOUR NAME MANAGER");
           name=s.nextLine();
            System.out.println("ENTER YOUR SALARY");
        salary=s.nextInt();
         if(salary>50000){
            double bonus=(salary*15/100);
            System.out.println("BONUS IS "+bonus);
            double total=bonus+salary;
            System.out.println("TOTAL SALARY OF THE MANAGER IS "+total);

        }

   }

}
public class PolyD {
    public static void main(String[] args) {
        Employee d=new Devloper();
        Employee m=new Manager();
        d.calculateSalary();
        m.calculateSalary();
    }
    
}
