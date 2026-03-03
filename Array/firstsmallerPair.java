import java.util.Scanner;

public class firstsmallerPair {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of the array:");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=scanner.nextInt();
        }
       
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
       
    }
}
