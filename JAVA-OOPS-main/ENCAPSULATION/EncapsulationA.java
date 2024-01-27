/*Create a class called Person with private properties name, age and id.
Implement public getter and setter methods to access and modify these properties.
Use encapsulation to protect the internal state of the Person object. */

class Person{
    private String name;
    private int age;
    private int id;

   public String getName(){
    return name;
   }

   public void setName(String name){
    this.name=name;
   }

   public int getAge(){
    return age;
   }

   public void setAge(int age){
    this.age=age;
   }

   public int getId(){
    return id;
   }

   public void setId(int id){
    this.id=id;
   }

}
class EncapsulationA{
    public static void main(String[] args) {
        Person p=new Person();
        p.setAge(22);
        p.setId(234);
        p.setName("TEJAS M");
        System.out.println("Name: "+p.getName()); 
        System.out.println("Age: "+p.getAge());
        System.out.println("Id: "+p.getId()+"\n");

    }
}



