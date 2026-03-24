package SubStrings;
import java.util.*;
public class CheckCharInString 
{
   public static void main(String[] args) 
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the String: ");   
      String s = scan.nextLine(); 
      System.out.print("Enter the character to check: "); 
      String s2=scan.nextLine();
      int i=0, j=0;
      while(i<s.length() && j<s2.length()) 
      {
        if(s.charAt(i)==s2.charAt(j))
        {
            i++;
            j++;
        }
        else
        {
            i++;
        }
      }
      System.out.println(j==s2.length() ? "Yes" : "No");
    }
}
