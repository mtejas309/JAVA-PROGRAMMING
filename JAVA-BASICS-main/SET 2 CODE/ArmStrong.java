import java.util.Scanner;
public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a=sc.nextInt();
        int last;
        int qube=0;
        int temp=a;
        while(a!=0){
            last=a%10;
            qube=qube+last*last*last;
            a=a/10;
        }
        if(qube==temp){
            System.out.println("ARMSTRONG");
        }else{
            System.out.println("NOT ARMSTRONG");
        }
        sc.close();
    }
}
