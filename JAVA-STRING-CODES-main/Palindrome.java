/*CHECK GIVEN WORD IS PALINDROME OR NOT */
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int count=0;
       for(int i=0;i<str.length()/2;i++){
         count=0;
            for(int j=str.length()/2;j>0;j--){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                    
                }
               
       }
       
    }
    if(count==1){
        System.out.println("NOT PALIDROME");
       }
       else{
        System.out.println("PALINDROME");
       }
}
}
