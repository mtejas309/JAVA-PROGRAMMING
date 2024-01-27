import java.util.Scanner;
public class Unique {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER ARRAY LENGTH");
        int a=s.nextInt();
        int arr[]=new int[a];
        int count=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
             count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
              
            }
            if(count==1){
                System.out.print(arr[i]+" ");
             }
            
        }
        
    }
}
