package ExamQuestions;
import java.util.*;
public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch) + 1);
            }
            else
            {
                map.put(ch, 1);
            }
        }
        int count=0;
        for(Character key : map.keySet())
        {
            if(map.get(key) > 1)
            {
                count++;
            }
        }
        if(count == 0)
        {
            System.out.print("No Repeating Character");
        }
        else
        {
            int count1 = 0;
            for(Character key : map.keySet())
            {
                if(map.get(key) > 1)
                {
                    count1++;
                    System.out.print(key);
                    if(count1 < count)
                    {
                        System.out.print(" and ");
                    }
                }
            }
            if(count == 1)
            {
                System.out.print(" is Repeating Character");
            }
            else
            {
                System.out.print(" are Repeating Characters");
            }
        }
    }
}


