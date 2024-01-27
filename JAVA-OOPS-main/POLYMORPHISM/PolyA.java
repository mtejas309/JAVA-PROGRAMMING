/*Create a base class called Shape with a method calculateArea().
Derive three classes Rectangle, Circle, and Triangle from Shape. 
Implement the calculateArea() method in each derived 
class to calculate the area of the respective shape. 
Use polymorphism to create an array of Shape objects and 
call the calculateArea() method on each object. */

import java.util.Scanner;

class Shape{
    Scanner s=new Scanner(System.in);
    void calculateArea(){
        System.out.println("PLEASE GIVE THE PROPERTIES VALUE TO GET TH AREA OF RESPECTIVE SHAPE");
    }
}
class Rectangle extends Shape{
    void calculateArea(){
        super.calculateArea();
        System.out.println("ENTER THE LENGTH OF RECTANGLE");
        int l=s.nextInt();
        System.out.println("ENTER THE WIDTH OF RECTANGLE");
        int w=s.nextInt();
        int area=l*w;
        System.out.println("AREA OF RECTANGLE IS "+area);
    }

}
class Circle extends Shape{
    void calculateArea(){
          System.out.println("ENTER THE RADIUS OF CIRCLE");
          int r=s.nextInt();
          Double area=Math.PI*r*r;
          System.out.println("AREA OF CIRCLE IS"+area+" ");
    }
    
}
class Triangle extends Shape{
    void calculateArea(){
        System.out.println("ENTER BASE OF TRIANGLE");
        int b=s.nextInt();
        System.out.println("ENTER HEIGHT OF TRIANGLE");
        int h=s.nextInt();
        double area=(b/2)*h;
        System.out.println("AREA OF TRIANGLE IS "+area);

    }
    
}





public class PolyA {
    public static void main(String[] args) {
       Shape c=new Circle();
       Shape r=new Rectangle();
       Shape t=new Triangle();
       r.calculateArea();
       t.calculateArea();
       c.calculateArea();
        
    }
    
}
