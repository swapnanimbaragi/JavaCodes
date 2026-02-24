import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int a[]=new int[N];
        for(int i=0;i<N;i++)
        {
            a[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<N;i++)
        {
            if(a[i]>largest)
            {
                largest=a[i];
                
            }
        }
        for(int i=0;i<N;i++)
        {
            if(a[i]==largest)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}