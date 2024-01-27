import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("ENETR A NUMBER TO PRINT ITS REVERSE");
        int a=s.nextInt();
        int last;
        while(a!=0){
            last=a%10;
            System.out.print(last);
            a=a/10;
        }
        s.close();
    }
}
