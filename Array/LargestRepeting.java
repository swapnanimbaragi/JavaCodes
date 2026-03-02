import java.util.Scanner;

public class LargestRepeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            {
                largest=a[i];
            }
        }
        if(largest == Integer.MIN_VALUE)
        System.out.println(-1);
        else
        System.out.println(largest);
    }
}
