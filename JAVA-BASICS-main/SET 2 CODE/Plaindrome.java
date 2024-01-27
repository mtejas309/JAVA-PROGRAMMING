import java.util.Scanner;

public class Plaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENETR THE NUMBER ");
        int a=sc.nextInt();
        int last,rev=0;
        int og=a;
        while(a!=0){
            last=a%10; 
            rev=rev*10+last;
            a=a/10;
        }
       if(rev==og){
        System.out.println("ITS A PALINDROME");
       }else{
        System.out.println("NOT A PALINDROME");
       }
       sc.close();
       
    }
}
