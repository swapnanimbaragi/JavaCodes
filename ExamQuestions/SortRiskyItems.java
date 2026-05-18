package ExamQuestions;
import java.util.*;
public class SortRiskyItems {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int i=arr.length-1, j=arr.length-1;
        while(i>=0)
        {
            if(arr[i]==0)
            {
                i--;
            }
            else{
                arr[j]=arr[i];
                j--;
                i--;
            }
        }
        while(j>=0)
        {
            arr[j]=0;
            j--;
        }
        Arrays.sort(arr);
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
