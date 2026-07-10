import java.util.Scanner;

public class RearangeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int i=0;
        int j=0;
        while(i<n)
        {
            if(arr[i]==0)
            {
                i++;
            }
            else
            {
                arr[j]=arr[i];
                j++;
                i++;
            }
        }
        while(j<n)
        {
            arr[j]=0;
            j++;
        }
        
        for(int k=0;k<n;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
