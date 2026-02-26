import java.util.Scanner;

public class PosNeg {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = sc.nextInt();
        // implement your logic here
        int a[]=new int[N];
        System.out.println("Enter the array elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Negative numbers in the array are:");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<0)
            {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Positive odd numbers in the array are:");
        for(int k=0;k<a.length;k++)
        {
            if(a[k]%2 !=0 && a[k]>0)
            {
                System.out.print(a[k] + " ");
            }
        }
        System.out.println();
        for(int j=0;j<a.length;j++)
        {
            if(a[j]%2 == 0 && a[j] >0)
            {
                System.out.print(a[j] + " ");
            }
        }
            
        
    }
}
