import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        
        System.out.println("Prime factors of " + a + " are:");
        
        for (int i = 2; i <= a; i++) {
            while (a % i == 0) {  
                System.out.println(i);
                a = a / i;
            }
        }
        s.close();
    }
}

