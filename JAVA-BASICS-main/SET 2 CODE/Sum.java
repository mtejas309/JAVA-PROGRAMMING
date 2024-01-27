import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO GET ITS SUM");
        int a=s.nextInt();
        int last;
        int sum=0;
        while(a!=0){
            last=a%10;
            sum=last+sum;
            a=a/10;
        }
        System.out.println(sum);
        s.close();
    }
}
