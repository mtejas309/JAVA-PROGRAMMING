import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER A NUMBER CHECK ITS FACTORIAL");
        int a=s.nextInt();  // 4
        int sum=1;  //
        for(int i=a;i>=1;i--){ // 4,3,2,1
            sum=sum*i;   
        }
        System.out.println("THE FACTORIAL OF GIVEN NUMBER IS : "+sum);
        s.close();
    }
}
