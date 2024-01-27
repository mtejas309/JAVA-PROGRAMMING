/*Create an abstract class called Shape with an abstract method calculateArea(). 
Derive three classes Rectangle, Circle, and Triangle from Shape.
Implement the calculateArea() method in each derived class to calculate the area of the respective shape. 
Use abstraction to ensure that the calculateArea() method is implemented in each derived class.*/
abstract class Shape {
	void calculateArea() {
		
	}

}

class Rectangle extends Shape {

	void calculateArea() {
		super.calculateArea();
		int l = 10, b = 20;
		int a = l * b;
		System.out.println("AREA OF RECTANGLE " + a);
	}
}

class Triangle extends Shape {
	void calculateArea() {
		int a = 10, h = 5;
		double b = 0.5 * a * h;
		System.out.println("AREA OF TRIANGLE " + b);

	}
}

class Circle extends Shape {
	void calculateArea() {
		double r = 6;
		double b = (22 / 7) * r * r;
		System.out.println("AREA OF CIRCLE " + b);
	}
}

class AbsB {
	public static void main(String args[]) {
		Shape a = new Circle();
		Shape b = new Rectangle();
		Shape c = new Triangle();
		a.calculateArea();
		b.calculateArea();
		c.calculateArea();
	}
}