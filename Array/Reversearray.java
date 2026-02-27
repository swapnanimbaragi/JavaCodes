import java.util.Scanner;

public class Reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // implement your logic here
        int a[]=new int[N];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int last;
        int rev=0;
        for(int i=a.length-1 ; i>=0 ; i--)
        {
            System.out.print(a[i]+ " ");
        }
    }
}

