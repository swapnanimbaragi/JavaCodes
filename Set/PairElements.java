package Set;

import java.util.*;

public class PairElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the size of array");
        int n = scan.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the elements of array");

        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Store unique pairs
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < n - 1; i++) {
            String pair = arr[i] + "," + arr[i+1];
            set.add(pair);
        }

        // Print count
        System.out.println(set.size());
    }
}
    
