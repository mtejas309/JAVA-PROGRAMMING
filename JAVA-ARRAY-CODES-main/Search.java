/*CHRCK IF ELEMENT PRESENT OR NOT */
import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER ARRAY LENGTH");
        int a=s.nextInt();
        int arr[]=new int[a];
        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("ENTER ELMENT TO CHECK IF ITS PRESENT OR NOT");
        int b=s.nextInt();
        for(int i=0;i<arr.length;i++){
            if(b==arr[i]){
                System.out.println("PRESENT IN "+i+" POSITION");
                break;
            }
        
        }

    }
}
