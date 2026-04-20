package Practice;
import java.util.*;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String result = "";
        boolean found = false;

        while(n > 0)
        {
            int digit = n % 10;

            if(digit % 2 == 0)
            {
                result = digit + " " + result;
                found = true;   // ✅ moved here
            }

            n = n / 10;
        }

        if(found)
        {
            System.out.print(result);
        }
        else
        {
            System.out.println("No even digits found");
        }
    }
}