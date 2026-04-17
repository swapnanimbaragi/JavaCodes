package ExamQuestions;
import java.util.*;

public class CountcharAfterWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] words = str.split(" ");

        for(int i = 0; i < words.length; i++)
        {
            String word = words[i];
            int count = word.length();

            System.out.print(word + count + " ");
        }
    }
}