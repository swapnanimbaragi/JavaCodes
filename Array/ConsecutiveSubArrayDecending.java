
import java.util.Scanner;

public class ConsecutiveSubArrayDecending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        System.out.print("Enter the elements of the array: ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for(int i=a.length-1;i>0;i--)
        {
            System.out.print(a[i] + " ");
            if(a[i] - a[i-1] != 1)
            {
                System.out.println();
            }
        }
        System.out.print(a[a.length-1]);
    }
}
