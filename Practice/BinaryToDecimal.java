package Practice;
import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int dec=0;
        int power=0;
        while(n>0)
        {
            int digit=n%10;
            dec=dec+digit*(int)Math.pow(2,power);
            n=n/10;
            power++;
        }
        System.out.print(dec);
    }
}
