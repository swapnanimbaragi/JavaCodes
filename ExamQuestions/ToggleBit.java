package ExamQuestions;
import java.util.*;
public class ToggleBit {
   public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int bits = Integer.toBinaryString(n).length();
        int mask = (1 << bits) - 1;

        int result = n ^ mask;

        System.out.println(result);
   }
}
