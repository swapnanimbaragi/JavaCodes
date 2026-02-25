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
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}

//		System.out.print(result);
//		
//		int result1=MaxOfArray(a);
//		System.out.println(result1);
		int sum=SumOfArray(a);
        System.out.println(sum);
		int max=MaxOfArray(a);
        System.out.println(max);
		int min=MinOfArray(a);
        System.out.println(min);
		System.out.println(sum-max);
		System.out.print(sum-min);
	}

}
