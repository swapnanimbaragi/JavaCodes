package Map;
import java.util.*;
public class OddFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");  
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<n;i++)
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
        for(Integer key:keys)
        {
            if(map.get(key)%2!=0)
            {
                System.out.println("Odd frequency element: " + key);
                found=true;
            }
        }
        if(!found)
        {
            System.out.println("No odd frequency element found.");
        }

    }
}
