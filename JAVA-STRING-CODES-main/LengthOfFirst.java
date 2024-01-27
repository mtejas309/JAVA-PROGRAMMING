/*LENGTH OF LAST WORD */
import java.util.Scanner;

public class LengthOfFirst {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str =s.nextLine();
        String str1[]=str.split(" ");
        for(int i=0;i<str1.length;){
            System.out.println("length of first word is "+str1[0].length());
            break;
        }
    }
}
