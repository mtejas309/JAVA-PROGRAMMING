/*DECENDING ORDER */
import java.util.Scanner;
public class Decending {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length of Array");
        int a=s.nextInt();
        int arr[]=new int[a];
         System.out.println("Enter Array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
