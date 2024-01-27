/*ENTER ELEMENT IN SPECIFIC INDEX POSITION*/
import java.util.Scanner;
class EnterInSpecific{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int a=s.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

         System.out.println("Enter index number to which you want to add new element");
         int b=s.nextInt();
          System.out.println("Enter the element to add on specific index");
          int c=s.nextInt();

         //        //CREATE NEW ARRAY TO ADD ELEMENT 
        int newarr[]=new int[arr.length+1];

        //COPY ELEMENTS BEFORE INDEX
        for(int i=0;i<b;i++){
            newarr[i]=arr[i];
        }
        newarr[b]=c; //ADD ELEMENT TO SPECIFIC POSITION

        //COPY ELEMENTS AFTER INDEX
        for(int i=b+1;i<newarr.length;i++){
            newarr[i]=arr[i-1];
        }
        
        //PRINT ALL ELEMENETS AFTER SHIFTING
        for(int i=0;i<newarr.length;i++){
            System.out.println(newarr[i]);
        }


        
    }
}