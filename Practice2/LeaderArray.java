import java.util.Scanner;
public class LeaderArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            arr[i] = scanner.nextInt();
        }
        // for(int i=0;i<n;i++)
        // {
        //     boolean found=false;
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(arr[j]>arr[i])
        //         {
        //             found=true;
        //             break;
        //         }
        //     }
        //     if(!found)
        //     {
        //         System.out.print(arr[i]+" ");
        //     }
        // }

        int total = 0;

        for(int i = 0; i < n - 1; i++)
        {
            total += arr[i];
        }

        int sum = n * (n + 1) / 2;

        int missing = sum - total;

        System.out.println(missing);
        
    }
}
