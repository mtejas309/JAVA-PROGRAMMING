/*HIGHEST FREQUENCY OF CHARACTER */
import java.util.Scanner;
public class HighestCount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int max=0;
        int count=0;
        char maxchar=' ';
        for(char ch='A';ch<='z';ch++){
            count=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==ch){
                    count++;
                }
            }
            if(count>max){
                max=count;
                maxchar=ch;
            }
            
        }
        System.out.println("Character with the highest frequency: " + maxchar);
        System.out.println("Frequency: " + max);
        


    }
}

