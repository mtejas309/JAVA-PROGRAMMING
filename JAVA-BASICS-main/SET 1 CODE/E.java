/*13. Write a JAVAprogram to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
*/
import java.util.Scanner;
public class E {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    int d=s.nextInt();
    int e=s.nextInt();
    int total=a+b+c+d+e;
    System.out.println("total for 500 is : "+total);
    int per=(total*100)/500;
    System.out.println("percentage of the student is : "+per);
    if(per>=90){
        System.out.println("GRADE : A");
    }
    else if(per>=80){
        System.out.println("GRADE : B");
    }
    else if(per>=70){
        System.out.println("GRADE : C");
    }
    else if(per>=60){
        System.out.println("GRADE : D");
    }
    else if(per>=50){
        System.out.println("GRADE : E");
    }
     else {
        System.out.println("GRADE : F");
    }
    }
    
}
