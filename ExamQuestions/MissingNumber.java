package ExamQuestions;
import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n-1];
        for(int i=0; i<n-1; i++)
        {
            arr[i] = scan.nextInt();
        }
        int sum = n*(n+1)/2;
        for(int i=0; i<n-1; i++)
        {
            sum -= arr[i];
        }
        System.out.println(sum);
    }
}
