import java.util.Scanner;
public class MaxPairSum 
{
public static int findSecondSmallest(int[] array) 
    {
        // Write your code here
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max1)
            {
                max2=max1;
                max1=array[i];
                
            }
            else if(array[i]>max2 && array[i]<max1)
            {
                max2=max1;
            }
        }
        return max1+max2;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=scanner.nextInt();
        int array[]=new int[n];
        // int max1=scanner.nextInt();
        // int max2=scanner.nextInt();
        for(int i=0;i<array.length;i++)
        {
            array[i]=scanner.nextInt();
        }
        int sum=findSecondSmallest(array);
        System.out.print(sum);
    }
}