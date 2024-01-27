/*15. Write a JAVAprogram to input electricity unit charges and calculate total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill
 */

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of Units: ");
        int a=s.nextInt();
        double b=0;
        if(a<=50){
        b=a*0.50;
        System.out.println(b);
        }
       else if(a>=150){
            b=(50*0.50)+(a-50)*0.75;
            System.out.println(b);
        }
        else if(a>=250){
            b=(50*0.50)+(100*0.75)+(a-150)*1.20;
            System.out.println(b);
        }
        else{
            b=(50*0.50)+(100*0.75)+(100*1.20)+(a-250)*1.50;
            System.out.println(b);

        }
    }
}
