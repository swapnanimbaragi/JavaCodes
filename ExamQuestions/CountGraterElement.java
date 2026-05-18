package ExamQuestions;
import java.util.*;
public class CountGraterElement {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int max=arr[0];
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                count++;
                max=arr[i];
            }
        }
        System.out.println(count);
    }
}
