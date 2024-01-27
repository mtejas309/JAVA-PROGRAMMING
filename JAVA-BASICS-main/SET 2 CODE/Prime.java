import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER A NUMBEER TO CHECK IF ITS PRIME OR NOT");
        int a=sc.nextInt();  // 10
        int count=0;
        for (int i=2;i<a;i++){  
            if(a%i==0){ 
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("PRIME");
        }
        else{
            System.out.println("not");
        }
        sc.close();
    }
}
