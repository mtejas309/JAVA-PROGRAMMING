/*7. Write a JAVAprogram to check whether a character is alphabet or not.*/

import java.util.Scanner;

public class A {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        char a= s.next().charAt(0);
      if(a>='A' && a<='z'){
       System.out.println("ALPHABETS");
      }
      else{
 System.out.println(" not ALPHABETS");
      }


    }
    
}
