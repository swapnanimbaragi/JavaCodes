package Practice;
import java.util.*;
public class LargestCollection {
    public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k=sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0;i<n;i++)
    {
        list.add(arr[i]);
    }
    Collections.sort(list);
    int largest = list.get(list.size()-k);
    System.out.print(largest);
}
}

