/*FREQUENCY OF NUMBERS IN ARRAY */
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER ARRAY LENGTH");
        int a=s.nextInt();
        int count=0;
        int arr[]=new int[a];
        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=-1;
                }
            }
            if(arr[i]!=-1){
                System.out.println(arr[i]+" "+count);
            }
        }
    }

}
