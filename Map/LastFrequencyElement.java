package Map;    
import java.util.*;
class LastFrequencyElement
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scan.nextInt();
        System.out.println("Enter the elements of the array:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scan.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) 
        {
            if (map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            } 
            else 
            {
                map.put(arr[i], 1);
            }
        }

        for (int i = n - 1; i >= 0; i--) 
        {
            if (map.get(arr[i]) > 1) 
            {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(arr[n-1]);
    }
}   