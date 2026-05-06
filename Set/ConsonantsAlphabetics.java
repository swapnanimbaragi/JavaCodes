package Set;
import java.util.*;
public class ConsonantsAlphabetics
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter string");
        String s=scan.nextLine().toLowerCase();
        TreeSet<Character> set=new TreeSet<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if( Character.isLetter(ch) && !(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
            
            {
                set.add(Character.toLowerCase(ch));
            }
        }
        if(set.isEmpty())
        {
            System.out.println("no consonants found");
        }
        for(Character ch : set)
        {
            System.out.print(ch+" ");
        }
        
    }
}