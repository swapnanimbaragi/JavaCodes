import java.util.Scanner;

public class Smallestrepeting {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = scanner.nextInt();
        System.out.println("Enter the elements of the array");
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
                System.out.println("Smallest Repeting element is "+a[i]);
                return;
            }
        }
        System.out.print(-1);
    }
}
