/*PRINT DUPLICATE CHARACTERS IN A STRING */
import java.util.Scanner;
public class Duplicate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER YOUR STRING");
        String scr=s.nextLine();
        for(int i=0;i<scr.length();i++){
            for(int j=i+1;j<scr.length();j++){
                if(scr.charAt(i)==scr.charAt(j)){
                    System.out.println("DUPLICATE LETTERS ARE "+scr.charAt(i));
                }
            }
        }
    }
    
}
