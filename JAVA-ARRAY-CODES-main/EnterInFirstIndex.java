/*ENTER ELEMENT IN FIRST INDEX POSITION */
import java.util.Scanner;
public class EnterInFirstIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER ARRAY LENGTH");
        int a = s.nextInt();
        int arr[] = new int[a];
        System.out.println("ENTER ARRAY ELEMENTS");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("ENTER ARRAY ELEMENT TO ADD ON FIRST INDEX POSITION");
        int b = s.nextInt();

        int newarr[] = new int[arr.length + 1];

        for (int i = 1; i < newarr.length; i++) {
            newarr[i] = arr[i - 1]; // Copy elements from arr to newarr
        }
        newarr[0] = b; // Insert the new element at the first index of newarr

        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }
}
