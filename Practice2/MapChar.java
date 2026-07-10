import java.util.*;
public class MapChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String s = scanner.next();
        // HashMap<Character, Integer> map = new HashMap<>();
        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);
        //     if(map.containsKey(ch))
        //     {
        //         map.put(ch,map.get(ch)+1);
        //     }
        //     else{
        //         map.put(ch,1);
        //     }

        // }
        // for(Character ch:map.keySet())
        // {
        //     if((map.get(ch)==1))
        //     {
        //         System.out.println(ch);
        //     }
        // }

        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);
        //     if(map.containsKey(ch))
        //     {
        //         map.put(ch,map.get(ch)+1);
        //     }
        //     else
        //     {
        //         map.put(ch,1);
        //     }
        
        // }

        // for(Character ch:map.keySet())
        // {
        //     if(map.get(ch) !=1)
        //     {
        //         System.out.println(ch);
        //     }
        // }
        int n=scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i],map.get(a[i])+1);
            }
            else{
                map.put(a[i],1);
            }
        }
        int max=Integer.MIN_VALUE;
        for(Integer ch:map.keySet())
        {
            if(map.get(ch)>max)
            {
                max=map.get(ch);
            }
        }
        for(Integer ch:map.keySet())
        {
            if(map.get(ch)==max)
            {
                System.out.print(ch);
            }
        }
    }
}
    

