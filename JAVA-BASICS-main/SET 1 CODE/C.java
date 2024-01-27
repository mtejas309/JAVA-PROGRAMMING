
// *10. Write a JAVAprogram to check whether a character is uppercase or lowercase alphabet.*/

import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);
        if(a>='A' && a<='Z'){
        System.out.println("UPPERCASE");
        }
        else if(a>='a' && a<='z'){
            System.out.println("LOWERCASE");
        }
        
        else{
                          
          System.out.println("INVALID CHARACTER");
        }

    }
}
