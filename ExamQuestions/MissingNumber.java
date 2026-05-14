package ExamQuestions;
import java.util.*;
public class MissingNumber
{
    static int missingNum(int n, int arr[])
    {
        int total = 0;

        // Adding numbers from 1 to n+1
        for(int i=1; i<=n+1; i++)
        {
            total += i;
        }

        // Subtracting array elements
        for(int i=0; i<arr.length; i++)
        {
            total -= arr[i];
        }

        return total;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scan.nextInt();
        }

        System.out.println(missingNum(n, arr));
    }
}