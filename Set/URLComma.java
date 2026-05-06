package Set;
import java.util.*;
public class URLComma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter string");
        String s=scan.nextLine();
        LinkedHashSet<String> set=new LinkedHashSet<>();
        String arr[]=s.split(",");
        for(String word : arr)
        {
            set.add(word);
        }
        for(String word : set)
        {
            System.out.print(word+" ");
        }
    }
}
