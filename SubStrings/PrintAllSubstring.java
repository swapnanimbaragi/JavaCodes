package SubStrings;
import java.util.Scanner;
public class PrintAllSubstring {
 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=scan.nextLine();
        for(int size=1;size<=s.length();size++)
        {
            for(int i=0;i<=s.length()-size;i++)
            {
                String t="";
                for(int j=i;j<i+size;j++)
                {
                    t=t+s.charAt(j);
                }
                System.out.println(t);
            }
        }
    }
}


