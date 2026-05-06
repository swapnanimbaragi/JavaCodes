package Map;
import java.util.*;
public class PairsFormation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
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
        int pairs = 0;
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            pairs = pairs + map.get(key) / 2;
        }
        System.out.println("number of pairs: " + pairs);
    }
}
