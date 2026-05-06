import java.util.*;
public class ProductofMidToEnd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n=scan.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int product=1;
        for(int i=n/2;i<n;i++)
        {
            product=product*a[i];
        }
        System.out.println("Product=" + product);
    }
}
