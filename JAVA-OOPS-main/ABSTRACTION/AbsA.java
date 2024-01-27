/*Create an abstract class called Animal with an abstract method makeSound(). 
Derive two classes Dog and Cat from Animal. 
Implement the makeSound() method in each derived class to make a different sound. 
Use abstraction to ensure that the makeSound() method is implemented in each derived class. */
abstract class Animal{
    void makeSound(){
        System.out.println("ANIMALS SOUNDS ARE BETTER THAN PARENTS SCOLDINGS");

    }

}

class Dog extends Animal{
     void makeSound(){
        System.out.println("DOG BARKS");

    }

}
class Cat extends Animal{
     void makeSound(){
        super.makeSound();
 System.out.println("CAT MEOWS");
    }

}
class AbsA{
    public static void main(String[] args) {
        Animal c=new Cat();
        Animal d=new Dog();
        c.makeSound();
        d.makeSound();
        
    }
}