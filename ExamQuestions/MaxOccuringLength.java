package ExamQuestions;
import java.util.*; 
public class MaxOccuringLength {
   


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] words = s.split(" ");

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < words.length; i++)
        {
            int len = words[i].length();

            if(map.containsKey(len))
            {
                map.put(len, map.get(len) + 1);
            }
            else
            {
                map.put(len, 1);
            }
        }

        int maxOccurrence = 0;
        int maxLength = 0;

        for(Integer key : map.keySet())
        {
            if(map.get(key) > maxOccurrence)
            {
                maxOccurrence = map.get(key);
                maxLength = key;
            }
        }

        System.out.println("occurance: " + maxOccurrence + " length: " + maxLength);
    }
}
