package Strings;
import java.util.*;
public class StringSCharKindex{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        char k = scan.next().charAt(0);
        boolean found=false;
        for(int i = 0; i < s.length(); i++)
        {
            char ch=s.charAt(i);
            if(ch==k)
            {
                System.out.print(i);
                found=true;
            }
        }
        if(!found)
        {
            System.out.print(-1);
        }
    }
}
