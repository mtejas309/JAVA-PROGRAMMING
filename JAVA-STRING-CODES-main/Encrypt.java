/*ENCRYPT EVEN INDEX CHARACTERS */
import java.util.Scanner;
public class Encrypt {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("enter your string");
        String str=s.nextLine();
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                System.out.print(str.charAt(i));
            }
          
        }
    }
    
}
