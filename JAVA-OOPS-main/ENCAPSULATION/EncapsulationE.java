/*Create a class called Employee with private properties name, position, and salary. 
Implement public methods to get the employee's name and position and 
set the employee's salary. Use encapsulation to ensure that the salary can 
only be modified through the defined method. */
class Employee{
    private String name;
    private String position;
    private int salary;


    public String getname(){
        return name;
    }
    public void setname(String name){
    this.name=name;
    }

    public String getposition(){
        return position;
    }
    public void setposition (String position) {
        this.position = position;
    }

    public int getsalary(){
        return salary;
    }
    public void setsalary(int salary){
        this.salary=salary;
    } 

}
public class EncapsulationE {
     public static void main(String[] args) {
        Employee e=new Employee();
        e.setposition("SOFTWARE DEVELOPER");
        e.setsalary(90000);
        e.setname("TEJAS ");
        System.out.println("Name: "+e.getname());
        System.out.println("Position : "+e.getposition());
        System.out.println("Salary: "+e.getsalary());
     }
    
}
