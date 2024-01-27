/*Create a base class called Shape with a method draw(). 
Derive two classes Rectangle and Circle from Shape. 
Implement the draw() method in each derived class to draw the 
respective shape on the console using ASCII characters. 
Use polymorphism to create objects of Rectangle and 
Circle and call the draw() method on each object. */
class Base{
    void draw(){
        System.out.println("DRAWING OF SHAPES");

    }
}

class Rectangle extends Base{
    void draw(){
        super.draw();
        
          System.out.println("Drawing a rectangle:");
        System.out.println("**********");
        System.out.println("*        *");
        System.out.println("**********");

    }

}
class Circle extends Base{
    void draw(){
         System.out.println("Drawing a circle:");
        System.out.println("   ***   ");
        System.out.println(" *     * ");
        System.out.println(" *     * ");
        System.out.println("   ***   ");
    }
    
}
public class PolyE {
    public static void main(String[] args) {
        Base c=new Circle();
        Base r=new Rectangle();
        
        r.draw();
        c.draw();

        
    }
}
