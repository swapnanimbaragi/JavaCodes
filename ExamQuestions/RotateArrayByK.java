package ExamQuestions;
import java.util.Scanner;
public class RotateArrayByK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int k= sc.nextInt();
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            res[(i+k)%n]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
