/*CHECK IF NUMBER IS PRESENT IN ARRAY OR NOT */
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
             Scanner s=new Scanner(System.in);
    System.out.println("Enter array length");
    int a=s.nextInt();
    int arr[]=new int[a];
    System.out.println("Enter array elements");
    for(int i=0;i<arr.length;i++){
        arr[i]=s.nextInt();
    }
    System.out.println("ENTER NUMBER TO CHECK");
    int b=s.nextInt();

    for(int i=0;i<arr.length;){
        if(b==arr[i]){
            System.out.print("Number is present  ");
            break;
        }
        else{
            System.out.println("not");
            break;
        }
    }
  

    }
}
