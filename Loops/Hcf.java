
import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter n and m value");
        int n = scan.nextInt();
        int m = scan.nextInt();
        while(m!=0)
        {
            int temp=m;
            m=n%m;
            n=temp;
        }
        System.out.println(n);
    }
}
