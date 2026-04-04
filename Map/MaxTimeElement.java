package Map;
import java.util.*; 
public class MaxTimeElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int max=0;
        String maxKey=null;
        HashMap<String,Integer> map=new HashMap<>();
        for(String key:map.keySet())
        {
            int value=map.get(key);
            if(value>max)
            {
                max=value;
                maxKey=key;
            }
        }
        System.out.println(maxKey);
    }
}
