/*Create an abstract class called Shape with an abstract method draw(). 
Derive two classes Rectangle and Circle from Shape. 
Implement the draw() method in each derived class to draw the 
respective shape on the console. Use abstraction to ensure that the draw() 
method is implemented in each derived class.*/

abstract class Shape {
	void draw() {

	}
}

class circle extends Shape {
	void draw() {
		System.out.println("()");
	}
}

class rectangle extends Shape {
	void draw() {
		System.out.println("____");
		System.out.println("|___|");
	}
}

class AbsE {
	public static void main(String args[]) {
		Shape rectangle = new rectangle();
		Shape circle = new circle();

		rectangle.draw();
		circle.draw();
	}
}
