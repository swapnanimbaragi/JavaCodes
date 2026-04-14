package Practice;

import java.util.*;
class ReplaceDivisibleBykElements
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]%k==0)
            {
                if(arr[i]>0)
                {
                    arr[i]=k;
                }

                else
                {
                    arr[i]=-k;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}