/*CONVERT STRING TO INTEGER */
import java.util.Scanner;

public class ConverStringToInt {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int num=Integer.parseInt(str);
        System.out.println(num);
    }
}
