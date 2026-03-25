package Set;
import java.util.*;
public class LexicographicOrder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter string");
        String s=scan.nextLine();
        TreeSet<Character> set=new TreeSet<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            set.add(ch);
        }
        for(Character ch : set)
        {
            System.out.print(ch+" ");
        }
    }
}
