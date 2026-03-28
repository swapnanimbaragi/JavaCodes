package Map;
import java.util.*;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                System.out.println(arr[i]);
                return; 
            } else {
                set.add(arr[i]);
            }
        }

        System.out.println("No repeating element");
    }
}