/*ENTER IN LAST INDEX POSITION */
import java.util.Scanner;
public class EnterInLast {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER ARRAY LENGTH");
        int a=s.nextInt();
        int arr[]=new int[a];
        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("ENTER ELEMENT TO ADD AT LAST INDEX POSITION");
        int b = s.nextInt();

        int newarr[]=new int[arr.length+1];

        for(int i=0;i<newarr.length-1;i++){
            newarr[i]=arr[i];
        }
        newarr[arr.length]=b;

        for(int i=0;i<newarr.length;i++){
            System.out.println(newarr[i]);
        }

    }
}
