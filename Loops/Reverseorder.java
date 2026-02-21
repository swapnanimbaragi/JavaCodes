import java.util.*;
public class Reverseorder {
    static void reverse(int n)
    {
        int rev=0;
        while(n != 0)
        {
            int last=n%10;
            rev=rev*10+last;
            n=n/10;
        }
        System.out.println("Reversed number " + rev);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=scan.nextInt();
        reverse(n);



    }
}
