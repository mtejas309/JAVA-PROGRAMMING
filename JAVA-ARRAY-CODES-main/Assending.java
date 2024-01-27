/*ASSENDING ORDER */
import java.util.Scanner;
class Assending{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER ARRAY LENGTH");
        int a=s.nextInt();
        int arr[]=new int[a];
        System.out.println("ENTER ARRAY ELEMNTS");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();    
        }
       for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
       }
       System.out.println("THE SORTED ARRAY IS ");
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"  " );
       }
       
        }
       

    }
