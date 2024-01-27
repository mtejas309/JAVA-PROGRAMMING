import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);  
        int a=s.nextInt();
        int temp=a;
        int b;    
        int st=0;
        while (temp>0){
            int sum=1;
            b=temp%10;
            for(int i=1;i<=b;i++){
                sum=sum*i;
            }
            st=st+sum;
            temp/=10;
        }
        if(st==a){
            System.out.println("STRONG");
        }
        else{
            System.out.println("NOT A STRONG NO.");
        }
s.close();
    }
}