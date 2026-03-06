import java.util.Scanner;

public class RearrangementArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = scanner.nextInt();
        }

        int j = 0;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] >= 0)
            {
                int temp = a[i];

                for(int k = i; k > j; k--)
                {
                    a[k] = a[k-1];
                }

                a[j] = temp;
                j++;
            }
        }

        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}