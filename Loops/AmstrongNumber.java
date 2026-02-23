import java.util.*;

public class CountNumber
{
    static int CountDigit(int n)
    {
        int count=0;
        while(n != 0)
        {
            n=n/10;
            count++;
        }
        return count;

    }
}

public class AmstrongNumber {
    static int amstrong(int n1)
    {
        int last=0;
        int arm;
        int count;
        int OriginalNumber;
        while(n1 != 0)
        {
            last=n1%10;
            arm=arm+(int)Math.pow(last,count);
            n=n/10;

        }
        return arm==OriginalNumber;
    }

    public static void main(String[] args) 
    {
        static boolean isAmstrong(int n)
        {
            int count=CountDigit(n);
            int OriginalNumber=n;
            int arm=0;
        }
    }
    
}
