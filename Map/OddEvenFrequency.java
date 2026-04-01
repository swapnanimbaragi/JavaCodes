package Map;
import java.util.*;
public class OddEvenFrequency 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int count=map.get(arr[i]);
                map.put(arr[i],count+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        boolean found=false;
        Set<Integer> keys=map.keySet();
        for (Integer key : keys) {
            if ( key % 2 == 0 && map.get(key) % 2 != 0 && map.get(key) > 1  ) {
                System.out.println(key);
                found = true;
            } 
        }
    }
}
