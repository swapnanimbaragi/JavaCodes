package ExamQuestions;
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0, b = 1;
        for(int i=0; i<n; i++)
        {
            System.out.print(a+" ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
