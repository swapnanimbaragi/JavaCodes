import java.util.*;
public class SmallestNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=scan.nextInt();
        System.out.println("Enter Numbers");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int min=a[0];
        System.out.println("Minimum Number:");
        for(int i=0;i<n;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println(min);

    }
}
