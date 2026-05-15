package Practice;
import java.util.*;
public class OddUniqueElement {
    public static void main(String[] arr) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(a[i]))
            {
                int count = map.get(a[i]);
                map.put(a[i], count + 1);
            }
            else
            {
                map.put(a[i],1);
            }
        }
        boolean found = false;
        for(Integer key : map.keySet())
        {
            if(map.get(key) % 2 != 0)
            {
                System.out.println(key);
                found = true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("No odd unique element found.");
        }   
    }
}
