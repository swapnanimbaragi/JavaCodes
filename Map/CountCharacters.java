package Map;
import java.util.*;
public class CountCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String s = scan.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            if(ch==' ')
            {
                continue;
            }
            ch=Character.toLowerCase(ch);
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                map.put(ch, count + 1);
            } else {
                map.put(ch, 1);
            }
        }
        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
        

