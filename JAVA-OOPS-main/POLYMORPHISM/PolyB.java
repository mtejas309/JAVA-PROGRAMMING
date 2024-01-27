/*Create a base class called Animal with a method makeSound(). 
Derive three classes Dog, Cat, and Cow from Animal. 
Implement the makeSound() method in each derived 
class to make a different sound (e.g., "Woof", "Meow", "Moo"). 
Use polymorphism to create an array of Animal objects and 
call the makeSound() method on each object. */
class Animal{
    void makeSound(){
        System.out.println("ANIMALS SOUNDS ARE BETTER THAN PARENTS SCOLDING");

    }
}
class Dog extends Animal{
    void makeSound(){
        super.makeSound();
        System.out.println("DOG BARKS");

    }
}
class Cat extends Animal{
    void makeSound(){
         System.out.println("CAT MEOWS");

    }
}
class Cow extends Animal{
    void makeSound(){
         System.out.println("COW AMMBASS");
    }
}



class PolyB{
    public static void main(String[] args) {
        Animal c=new Cat();
        Animal cc=new Cow();
        Animal d=new Dog();
        d.makeSound();
        c.makeSound();
        cc.makeSound();
       
        
    }
}