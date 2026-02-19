import java.util.Scanner;
public class CommonfactorofNM
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the n & m Values");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        printCommonFactors(n, m);
    }

    public static void printCommonFactors(int n, int m) {
        // Your logic here
        int min=n>m?n:m;
        System.out.println("min" + min);
        
        for(int i=1 ;i<=min;i++)
        {
            if(n%i==0 && m%i==0)
            {
                System.out.println(i);
            }
        }
    }
}