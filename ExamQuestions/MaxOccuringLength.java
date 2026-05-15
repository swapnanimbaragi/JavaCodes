package ExamQuestions;
import java.util.*; 
public class MaxOccuringLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        String[] words = n.split(" ");
        HashMap<Integer, Integer> lengthCount = new HashMap<>();
        
        for(String word : words) {
            int length = word.length();
            lengthCount.put(length, lengthCount.getOrDefault(length, 0) + 1);
        }
        
        int maxCount = 0;
        int maxLength = 0;
        for(Map.Entry<Integer, Integer> entry : lengthCount.entrySet()) {
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxLength = entry.getKey();
            }
        }
        System.out.println(maxLength+" "+maxCount);
    }
}
