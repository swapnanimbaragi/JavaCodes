package ExamQuestions;
import java.util.*;
public class MovingZeros {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int i=0, j=0;
        while(i<arr.length)
        {
            if(arr[i]==0)
            {
                i++;
            }
            else{
                arr[j]=arr[i];
                j++;    
                i++;
            }
        }
        while(j<arr.length)
        {
            arr[j]=0;
            j++;
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
