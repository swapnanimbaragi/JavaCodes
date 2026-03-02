import java.util.Scanner;

public class Smallestrepeting {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a[]=new int[N];
        for(int i=0;i<N;i++)
        {
            a[i]=scanner.nextInt();
        }
        int small=a[0];
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i] == a[i + 1])
            {
                System.out.println(a[i]);
                return;
            }
        }
        System.out.print(-1);
    }
}
