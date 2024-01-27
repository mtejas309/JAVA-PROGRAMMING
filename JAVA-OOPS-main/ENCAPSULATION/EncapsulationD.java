/*Create a class called Car with private properties make, model, and year. 
Implement public methods to get and set the car's make, model, and year. 
Use encapsulation to protect the internal state of the car object and 
allow controlled access to its properties. */
class Car{
    private String make;
    private String end ;
    private  int year;

    public String getmake(){
        return make;
    }

    public void setmake(String make){
        this.make = make;
    }

    public String getEnd(){
        return end;
    }

    public void setEnd(String end){
        this.end=end;
    }

    public int getyear(){
        return year;
    }

    public void setyear(int year){
        this.year=year;
    }
}

public class EncapsulationD {
    public static void main(String[] args) {
        Car c=new Car();
        c.setmake("TOYATA");
        c.setEnd("TOPEND");
        c.setyear(2020);
        System.out.println("\nCar Details:");
        System.out.println(c.getmake());
        System.out.println(c.getEnd());
        System.out.println(c.getyear());
        
    }
}
