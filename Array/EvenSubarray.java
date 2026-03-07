import java.util.Scanner;

public class EvenSubarray {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        System.out.print("Enter the size of the array: ");
        int n=scanner.nextInt();
        System.out.println("Enter the elements of the array: ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        
        for(int size=1;size<=a.length;size++)
        {
            for(int i=0;i<=a.length-size;i++)
            {
                int sum=0;
                for(int j=i;j<i+size;j++)
                {
                    sum+=a[j];
                }
                if(sum%2==0)
                {
                    for(int j=i;j<i+size;j++)
                    {
                        System.out.print("Even subarray: "+a[j]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
