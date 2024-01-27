import java.util.Scanner;

public class DightCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENETR A NUMBER TO GETS ITS DIGIT COUNT");
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
           int last=n%10;
            count++;
            n/=10;
        }
        System.out.println(count);
        sc.close();
    }
}
