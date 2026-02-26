import java.util.*;
public class Secondlargest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter array");
        int n=scan.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n ;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.println("second largest");
        int p=Integer.MIN_VALUE;
        int vp=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>p)
            {
                vp=p;
                p=a[i];
            }
            else if(p>vp)
            {
                vp=a[i];
            }
        }
        System.out.print(vp);
    }
}
