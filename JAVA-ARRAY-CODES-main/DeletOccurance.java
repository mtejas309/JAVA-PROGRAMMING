/*DELETE  OCCURANCE */
import java.util.Scanner;

public class DeletOccurance {
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
            int lastOccurrenceIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    lastOccurrenceIndex = j;
                }
            }
            if (lastOccurrenceIndex == i) {
                System.out.println(arr[i]);
            }
        }
    }
}
