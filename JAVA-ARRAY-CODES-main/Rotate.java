/*ROTATE */
import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        
     Scanner s=new Scanner(System.in);
    System.out.println("Enter 1ST array length");
    int a=s.nextInt();
    int arr[]=new int[a];        //1 2 3 4
    System.out.println("Enter array elements");
    for(int i=0;i<arr.length;i++){
        arr[i]=s.nextInt();
    }

    System.out.println("Enter 2nd array length");
    int b=s.nextInt();
    int brr[]=new int[b];          //4 1 2 3
    System.out.println("Enter array elements");
    for(int i=0;i<arr.length;i++){
        brr[i]=s.nextInt();
    }

        for(int i=0;i<arr.length;i++){
         for(int j=0;j<brr.length;j++){
            if(arr[i]==brr[j+1] && arr[arr.length-1]==brr[0]){
                System.out.println("ROTATIONAL");
                break;
            }
            else{
                System.out.println("not");
                break;
                
            }
          
        }
    }


}
}
