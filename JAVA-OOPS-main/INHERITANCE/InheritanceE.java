/*Create a base class called Employee with properties name and salary.
 Derive two classes Manager and Developer from Employee. 
 Implement a method calculateBonus() in each derived 
 class to calculate the bonus based on the salary. 
 The Manager class should have a higher bonus percentage than the Developer class. */
 import java.util.Scanner;
 class Employee{
    String name;
    int salary;

 }

 class Manager extends Employee{
    Scanner s=new Scanner (System.in);

    void calculateBonus(){
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
 class Developer extends Manager{
    Scanner s=new Scanner (System.in);
    void calculateBonus(){
        super.calculateBonus();
        System.out.println("ENTER YOUR NAME DEVELOPER");
        name=s.nextLine();
        System.out.println("ENTER YOUR SALARY");
        salary=s.nextInt();
        if(salary>50000){
            double bonus=(salary*12/100);
            System.out.println("BONUS IS "+bonus);
            double total=bonus+salary;
            System.out.println("TOTAL SALARY OF THE DEVELOPERR IS "+total);

        }

    }

 }
 class InheritanceE{
    public static void main(String[] args) {
        
         Developer d = new  Developer ();
        
         d.calculateBonus();

    }
 }