/*LENGTH OF FIRST WORD */
import java.util.Scanner;

public class LengthOfLast {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String str=s.nextLine();
        String str1[]=str.split(" ");
        for(int i=0;i<str1.length;){
            System.out.println("LENGTH OF LAST WORD IS "+str1[str1.length-1].length());
            break;
        }
    }
}
