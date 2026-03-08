package Strings;
import java.util.Scanner;
public class Lexicographic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        int result=s1.compareTo(s2);
        if(result<0)
        {
            System.out.println(s1+" comes before "+s2);
        }
        else if(result>0)
        {
            System.out.println(s2+" comes before "+s1);
        }
        else
        {
            System.out.println("Both strings are equal");
        }
    }
}
