/*DELET FIRST OCUURANCE OF ARRAY ELEMENTS  */
import java.util.Scanner;

public class DeletFirstOccurance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER ARRAY LENGTH");
        int a = s.nextInt();
        int arr[] = new int[a];
        System.out.println("ENTER ARRAY ELEMENTS");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
