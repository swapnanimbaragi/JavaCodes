import java.util.*;
public class Duplicate
{
    public static void main(String[] args)
    {
        
        String s="Whatsapp";
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
        
            if(map.containsKey(s))
            {
                map.put(s, map.get(s)+s);
            }
            else
            {
                map.put(s, s);
            }
        }
       
        for(int key:map.keySet())
        {
            if(map.get(key).length()>1)
            {
                System.out.println(key);
            }
        }


    }
}