package Practice;
import java.util.*; 
public class Palemdrom {
    public static boolean isPalendrom(String s)
    {
        int i=0,j=0;
        while(i<j)
        {
            if(s.charAt(i) == s.charAt(j))
            {
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        if(isPalendrom(s))
        {
            System.out.println("The string is a palindrome.");
        }
        else
        {
            System.out.println("The string is not a palindrome.");
        }

    }
}
