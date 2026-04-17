package Practice;
import java.util.*;

public class MergeArrayAsendingDesending {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < n1; i++)
        {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < n2; i++)
        {
            arr2[i] = sc.nextInt();
        }

        int[] mergedArr = new int[n1 + n2];

        int i = 0, j = n2 - 1, k = 0;   // ✅ j from end

        while(i < n1 && j >= 0)
        {
            if(arr1[i] < arr2[j])
            {
                mergedArr[k++] = arr1[i++];
            }
            else
            {
                mergedArr[k++] = arr2[j--];
            }
        }

        while(i < n1)
        {
            mergedArr[k++] = arr1[i++];
        }

        while(j >= 0)
        {
            mergedArr[k++] = arr2[j--];
        }

        for(int x = 0; x < mergedArr.length; x++)
        {
            System.out.print(mergedArr[x] + " ");
        }
    }
}