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

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (int i = 0; i < n; i++) 
        {
            if (map.get(arr[i]) > 1) 
            {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}
