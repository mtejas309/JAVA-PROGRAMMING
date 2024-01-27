import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the number ");
        int a=s.nextInt();
        int sum=0;
        int temp=a;
        for(int i=a-1;i>=1;i--){
            if(a%i==0){
                sum=sum+i;
            }
        }
        if(temp==sum){
            System.out.println("ITS A PERFECT NUMBER");
        }
        else{
            System.out.println("NOT A PERFECT NUMBER");
        }
            s.close();
        
    }
}
