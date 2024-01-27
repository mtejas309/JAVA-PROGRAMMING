import java.util.Scanner;

public class Fcators {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENETR A NUMBER TO GET ITS FACTORS");
        int a=s.nextInt();
        System.out.println();
        for(int i=a;i>=1;i--){
            if(a%i==0){
                System.out.println(i);
            }
        }
s.close();
    }
}
