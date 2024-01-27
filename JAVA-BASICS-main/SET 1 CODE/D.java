// *12. Write a JAVAprogram to count total number of notes in given amount.
import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int bal1,notes1;
        if(a>500){      //4800
            notes1=a/2000;  //4800/2000=2
            bal1=a%2000;
            System.out.println("number of 2 thousand notes is"+notes1);
            int notes2=bal1/500;
            int bal2=bal1%500;
             System.out.println("number of 5 hundred notes is"+notes2);
             int notes3=bal2/200;
             int bal3=bal2%200;
             System.out.println("number of 2 hundred notes is "+notes3);
             int notes4=bal3/100;
             int bal4 =bal3%100;
             System.out.println("number of 1 hundred notes is "+notes4);

        }

		
    }
}

    
    
      

   
