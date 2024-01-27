/*25. Write a JAVAprogram to print multiplication table of any number. */
import java.util.Scanner;
public class R {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         int a=s.nextInt();
         for(int i=1;i<=10;i++){
            System.out.println(+a+"*"+i+"="+a*i);
         }
    }
}
