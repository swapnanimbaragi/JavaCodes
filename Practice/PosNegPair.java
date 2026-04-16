package Practice;
import java.util.Scanner;

public class PosNegPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(arr[i] + arr[j] == 0 && arr[j]+arr[i] == 0)
                {
                    System.out.println(arr[i] + " " + arr[j]);
                    flag = true;
                }
            }
        }
    }
}