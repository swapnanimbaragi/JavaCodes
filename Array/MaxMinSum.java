import java.util.Scanner;
public class MaxMinSum 
{
    public static int SumOfArray(int []a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++) 
		{
			sum=sum+a[i];
		}
		return sum;
	}
	
	public static int MaxOfArray(int a[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
		
	}
	public static int MinOfArray(int a[])
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter Array size");
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
        int sum=SumOfArray(a);
        System.out.println("Sum of Array Elements:"+ sum);
		int max=MaxOfArray(a);
        System.out.println("Maximum Number:"+ max);
		int min=MinOfArray(a);
        System.out.println("Minimum Number:"+ min);
		System.out.println("Difference between Sum and Maximum:"+ (sum-max));
		System.out.println("Sum minus Minimum:"+ (sum-min));
	}

}
