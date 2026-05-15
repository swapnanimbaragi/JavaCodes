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
                map.put(a[i],map.get(a[i])+1);
            }
            else
            {
                map.put(a[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()%2!=0)
            {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
