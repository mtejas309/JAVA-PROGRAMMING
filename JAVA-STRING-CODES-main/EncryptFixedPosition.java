/*ENCRYPT FIXED POSITION */
import java.util.Scanner;
public class EncryptFixedPosition {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER STRING");
        String str=s.nextLine();
        System.out.println("ENTER NUMBER OF POSITION TO SHIFT");
        int a=s.nextInt();
        String encrypt=" ";
        for(int i=0;i<str.length();i++){ 
        char ch=str.charAt(i);
        ch+=a;
        encrypt=encrypt+ch;
        }
        System.out.println(encrypt);
   

    }
}
