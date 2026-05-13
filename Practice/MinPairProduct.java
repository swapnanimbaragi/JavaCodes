package Practice;
import java.util.Scanner;
public class MinPairProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // Implementation for finding minimum pair product would go here
        int minProduct = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int product=arr[i]*arr[j];
                if(product < minProduct)
                {
                    minProduct = product;
                }
            }
        }
        System.out.println("Minimum pair product: " + minProduct);
    }
}
