package ExamQuestions;
import java.util.*;
public class NthFibbonacciee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1, b = 1, c = 0;

        if(n == 1 || n == 2) {
            System.out.println(1);
        } else {
            for(int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            System.out.println(c);
        }
        
    }
}
