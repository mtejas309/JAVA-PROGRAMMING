/*PRINT ONLY ALPHABETS FROM A STRING */
import java.util.Scanner;
class Alphabets{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER YOUR STRONG");
        String scr=s.nextLine(); 
        System.out.println("ALPHABETS PRESENT IN YOUR STRING ARE");
        for(int i=0;i<scr.length();i++){
            if(scr.charAt(i)>='A'&& scr.charAt(i)<='z'){
                System.out.print(scr.charAt(i));
            }
        }

    }
}