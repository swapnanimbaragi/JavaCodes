package Practice;
import java.util.*;
public class BinarToDecimal {
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    String binary="";
    while(n>0)
    {
        int rem=n%2;
        binary=rem+binary;
        n=n/2;
    }
    System.out.print(""+binary);
}
}
