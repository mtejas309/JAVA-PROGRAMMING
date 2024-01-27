import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO GET ITS PRODUCT");
        int a=s.nextInt();
        int last;
        int pro=1;
        while(a!=0){
            last=a%10;
            pro=pro*last;
            a=a/10;
        }
        System.out.println(pro);
        s.close();
    }
}
