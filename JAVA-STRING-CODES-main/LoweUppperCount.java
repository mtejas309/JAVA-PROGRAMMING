/*LOWERCASE UPPERCASE COUNT */
import java.util.Scanner;
public class LoweUppperCount {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int smallcount=0;
        int uppercount=0;
        int othercount=0;
        System.out.println("ENTER YOUR STRING");
        String scr=s.nextLine();
        for(int i=0;i<scr.length();i++){
            if(scr.charAt(i)>='a'&&scr.charAt(i)<='z'){
                smallcount++;
            }
            else if(scr.charAt(i)>='A'&&scr.charAt(i)<='Z'){
                uppercount++;
            }
            else{othercount++ ;}
        }
        System.out.println("SMALL LETTER COUNT "+smallcount);
         System.out.println("CAPS LETTER COUNT "+uppercount);
          System.out.println("OTHERS LETETR COUNT "+othercount);
        
    }
    
}
