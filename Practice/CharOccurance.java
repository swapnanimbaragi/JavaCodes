package Practice;
import java.util.*;
public class CharOccurance {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch== ' ')
            {
                continue;
            }
            
            if(map.containsKey(ch))
            {
                int count=map.get(ch);
                map.put(ch,count+1);
            }
            else
            {
                map.put(ch,1);
            }
            
        }
        Set<Character> keys=map.keySet();
        for(Character key:keys)
        {
            if(map.get(key)%2==0)
            {
                System.out.println(" "+key+" is even with count "+map.get(key));
            }
        }
    }
}
