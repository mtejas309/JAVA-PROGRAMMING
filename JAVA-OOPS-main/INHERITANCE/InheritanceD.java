/*Create a base class called Person with properties name and age. 
Derive a class Student from Person with an additional property grade. 
Implement a method displayInfo() in the Person class to display the name and age, 
and override the displayInfo() method in the Student class to display the name, age, and grade. */

class Person{
    String name;
    String age;
    void displayInfo(){
        name="SHIVA";
        age="INFINTY";
        System.out.println("NAME IS LORD "+name+" AGE IS "+age);

    }
}

class Student extends Person{
    String grade;
     void displayInfo(){
        super.displayInfo();
        name="GANESHA";
        age="INFINITE";
        grade=" TOP GRADE";
        System.out.println("NAME IS LORD "+name+" AGE IS "+age+" LEVEL AND "+grade);
    }
}

public class InheritanceD {
    public static void main(String[] args) {
        Student s=new Student();
        s.displayInfo();
        
    }
    
}
