package ExamQuestions;
import java.util.*;
public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[m];
        for(int i=0;i<n;i++)
        {
            arr1[i]=scanner.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arr2[i]=scanner.nextInt();
        }
        int res[]=new int[n+m];
        for(int i=0;i<n;i++)
        {
            res[i]=arr1[i];
        }
        for(int i=0;i<m;i++)
        {
            res[n+i]=arr2[i];
        }
        Arrays.sort(res);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
