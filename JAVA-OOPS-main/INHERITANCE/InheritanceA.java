/*Create a base class called Shape with a method calculateArea(). 
Derive two classes Rectangle and Circle from Shape. 
Implement the calculateArea() method in each derived 
class to calculate the area of the rectangle and circle, respectively. */

import java.util.Scanner;

class Shape{
    public int l;
    public int b;
    public int r;

     int getl(){
        return l;
    }

    public void setl(int l){
        this.l=l;
    }
     int getb(){
        return b;
    }

    void setb(int b){
        this.b=b;
    }

     int getr(){
        return r;
    }

    void setr(int r){
        this.r=r;
    }

   void  calculatearea(){

    }

  }

class Rectangle extends Shape{
    void calculatearea(){
    int area=getl()*getb();
    System.out.println("AREA OF RECTANGLE "+area);
    }
}

  class Circle extends Shape{

    void calculatearea(){
    double area=(22/7)*getr()*getr();
    System.out.println("AREA OF CIRCLE IS "+area);
    }

  }

public class InheritanceA {
    public static void main(String[] args) {
          Scanner ss=new Scanner(System.in);
        Circle c=new Circle();
        Rectangle r= new Rectangle ();
        System.out.println("ENTER LENGTH OF RECTANGLE");
        r.setl(ss.nextInt());
        System.out.println("ENTER BREADTH OF RECTANGLE");
        r.setb(ss.nextInt());
        System.out.println("ENTER RADIUS OF CIRCLE");
        c.setr(ss.nextInt());
        c.calculatearea();
        r.calculatearea();
        ss.close();
        
    }
}
