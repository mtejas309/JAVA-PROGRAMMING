/*Create a base class called Animal with properties name and sound and a method makeSound().
 Derive two classes Cat and Dog from Animal. Implement the makeSound()
method in each derived class to print the specific sound made by a cat or dog. */

class Animal{
    String name;
    String sound;
    void makesound(){
        System.out.println("ANIMAL SOUNDS ARE GODS SOUND");
    }
}

class Cat extends Animal{
    
      void makesound(){
        super.makesound();
        name="PERSIAN";
        sound="MEOW MEOW";
        System.out.println("CAT NAME IS "+name+" AND MAKES SOUND LIKE "+sound);

    }


}

class Dog extends Animal{
    void makesound(){
        name="PITBULL";
        sound="BOW BOW";
        System.out.println("CAT NAME IS "+name+" AND MAKES SOUND LIKE "+sound);
    }
}

class InheritanceC{
    public static void main(String[] args) {
        Cat c=new Cat();
        Dog d=new Dog();
        c.makesound();
        d.makesound();

    }
}