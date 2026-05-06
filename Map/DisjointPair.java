package Map;
import java.util.*; 
public class DisjointPair {
    public static void main(String[] args)
    {
        Scanner Scan=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=Scan.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=Scan.nextInt();
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
        Set<Integer> keys=map.keySet();
        {
            int pairs=0;
            for(Integer key:keys)
            {
                pairs=pairs+map.get(key)/3;
            }
            System.out.println("Number of disjoint pairs:" + pairs);
        }
    }
}
