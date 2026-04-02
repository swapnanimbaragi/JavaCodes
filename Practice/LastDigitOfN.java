package Practice;
import java.util.*;
public class LastDigitOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int lastDigit=n%10;
        System.out.println(lastDigit);
    }
}
