package Set;
import java.util.*;
public class UniqueCharFilter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter string");
        String s=scan.nextLine();
        String arr[]=s.split(" ");
        LinkedHashSet<String> set=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        for(String word : set)
        {
            System.out.print(word+" ");
        }

        
    }
}
