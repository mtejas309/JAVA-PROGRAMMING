/*
Create a class called Student with private properties name, age, and grade.
Implement public methods to get the student's name, set the student's age, and
calculate the student's grade based on exam scores.
Use encapsulation to control access to the private properties and maintain the integrity of the data
*/
import java.util.Scanner;
class Student{
    Scanner s=new Scanner(System.in);
    private String name;
    private int age;
    private String grade;

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }

    public String getgrade(){
        return grade;
    }

    public void setgrade(String grade){
        this.grade=grade;
    }

    void gradeSystem(){
        System.out.println("ENTER 1st SUBJECT MARKS");
        int a=s.nextInt();
         System.out.println("ENTER 2nd SUBJECT MARKS");
        int b=s.nextInt();
         System.out.println("ENTER 3st SUBJECT MARKS");
        int c=s.nextInt();
         System.out.println("ENTER 4th SUBJECT MARKS");
        int d=s.nextInt();
        System.out.println("NAME OF STUDENT IS : "+getname());
        System.out.println("AGE OF STUDENT IS : "+getAge());

        int total=a+b+c+d;
        if((total/400)*100<80){
            System.out.println("GRADE : A");
        }
         else if((total/400)*100<60){
            System.out.println("GRADE : B");
        }
        else if((total/400)*100<40){
            System.out.println("GRADE : C");
        }
        else{
            System.out.println("GRADE : FAIL");
        }

    }

    
}

public class EncapsulationC {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        Student s1 = new Student ();
        System.out.println("ENTER STUDENT NAME");
        s1.setname(ss.next());
        System.out.println("ENTER STUDENT AGE");
        s1.setage(ss.nextInt());
        s1.gradeSystem();
       ss.close();
        
    }
    
}
