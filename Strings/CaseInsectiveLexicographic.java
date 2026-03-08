package Strings;
import java.util.Scanner;
public class CaseInsectiveLexicographic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1=scanner.nextLine();
        System.out.print("Enter the second string: ");  
        String s2=scanner.nextLine();
        int result=s1.compareToIgnoreCase(s2);
        if(result>0)
        {
            System.out.println("s1>s2");
        }
        else if(result<0)
        {
            System.out.println("s2<s1");
        }
        else
        {
            System.out.println("Both strings are equal");
        }
    }
}
