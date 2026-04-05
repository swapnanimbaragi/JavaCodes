package Map;
import java.util.*;
public class DuplicateElementFinder 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
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
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.print("Duplicate Element: " + key + " ");
            }
        }
    }
}

