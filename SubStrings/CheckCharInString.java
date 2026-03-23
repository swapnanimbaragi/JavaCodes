package SubStrings;
import java.util.*;
public class CheckCharInString {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the String: ");   
      String s = scan.nextLine(); 
      System.out.print("Enter the character to check: "); 
      String s2=scan.nextLine();
      for(int i=0;i<=s.length()-s2.length();i++)
      {
          String t="";
          for(int j=i;j<i+s2.length();j++)
          {
              t=t+s.charAt(j);
          }
          if(t.equals(s2))
          {
              System.out.println("Character is present in the string.");
              return;
          }
      }
      System.out.println("Character is not present in the string.");
   } 
}
