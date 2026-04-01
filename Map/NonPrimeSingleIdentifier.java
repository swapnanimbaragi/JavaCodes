package Map;
import java.util.*;
public class NonPrimeSingleIdentifier {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        boolean found = false;
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            if (!isPrime(key) && map.get(key) == 1) {
                System.out.println("Non-prime single identifier: " + key);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No non-prime single identifier found.");
        }
    }
}
