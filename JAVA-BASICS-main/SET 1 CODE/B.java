
/*9. Write a JAVAprogram to input any character and check whether it is alphabet, digit or special character.*/

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);
        if(a>='A' &&a<='z'){
            System.out.println("GIVEN CHARACTER is ALPHABET");
        }
       else if(a>='0' && a<='9'){
             System.out.println("GIVEN CHARACTER is NUMBER");
        }
        else{
            System.out.println("Special character");
        }


        
        
    }
}
