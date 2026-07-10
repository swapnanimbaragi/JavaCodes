import java.util.Scanner;
public class Kthlargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < k; i++) 
        {
            int maxIndex = 0;
            for (int j = 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            System.out.println(arr[maxIndex]);
            arr[maxIndex] = Integer.MIN_VALUE; // Mark the largest element as used
        }
        
    }
    
}
