/*22. Write a JAVAprogram to find sum of all natural numbers between 1 to n. */
import java.util.Scanner;
public  class P {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int b=s.nextInt();
        for(int i=1;i<=b;i++){
             sum=sum+i;
        }
        System.out.println(sum);
    }
}
