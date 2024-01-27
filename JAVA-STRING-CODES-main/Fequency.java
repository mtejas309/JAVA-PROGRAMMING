/*FREQUENCY OF EACH CHARACTER */
import java.util.Scanner;

public class Fequency {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    System.out.println("ENTER YOUT STRING");
    String str=s.nextLine();
    int count=0;
    for(char ch='A'; ch<'z';ch++){
        count=0;
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                count++;
            }
        }
        if(count!=0){
            System.out.println(ch+" "+count);
        }
    }
    }
}
