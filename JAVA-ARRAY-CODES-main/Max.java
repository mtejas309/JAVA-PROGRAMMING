/*MAX DIGIT IN ARRAY */
import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER ARRAY LENGTH");
        int a=s.nextInt();
        
        int arr[]=new int[a];
        int temp;
        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
          
        }
        System.out.println("MAX NUMBER IN ARRAY IS");
        for(int i=0;i<arr.length;){
            System.out.print(arr[0]+" ");
            break;
        }
    }
}

