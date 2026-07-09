import java.util.Scanner;
public class longestSubArrya
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        for(int size=n;size>=1;size--)
        {
            for(int i=0;i<=n-size;i++)
            {
                for(int j=i;j<i+size;j++)
                {
                    System.out.print(arr[j]+" ");
                    
                }
                System.out.println();
                return;
                
            }
        }
    
    }
}