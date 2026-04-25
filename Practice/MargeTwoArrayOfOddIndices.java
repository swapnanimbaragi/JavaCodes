package Practice;
import java.util.*;
public class MargeTwoArrayOfOddIndices {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();

        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }

        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=scanner.nextInt();
        }

        // collect odd index elements from a and b
        int res[] = new int[n/2 + m/2];  // only odd index elements
        int k = 0;

        for(int i = 0; i < n; i++)
        {
            if(i % 2 != 0)       
                res[k++] = a[i];
        }
        for(int i = 0; i < m; i++)
        {
            if(i % 2 != 0)       // odd index of b
                res[k++] = b[i];
        }

        Arrays.sort(res);

        for(int i = 0; i < res.length; i++)
        {
            System.out.print(res[i] + " ");
        }
            
    }
}
