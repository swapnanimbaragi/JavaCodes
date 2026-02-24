 import java.util.Scanner;

public class FloatElement 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array size");
        int n=scanner.nextInt();
        System.out.println("Enter the array Number");
        float a[]=new float[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextFloat();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }

    }
}


