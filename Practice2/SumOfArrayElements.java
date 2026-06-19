import java.util.*;
public class SumOfArrayElements {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        // int n=scanner.nextInt();
        // int [] a=new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     a[i]=scanner.nextInt();
        // }
        //Sum of array elements
        // int sum=0;
        // for(int i=0;i<n;i++)
        // {
        //     sum+=a[i];
        // }
        // System.out.println("Sum of array elements: "+sum);

        // largest element in the array
        // int largest=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++)
        // {
        //     if(a[i]>largest)
        //     {
        //         largest=a[i];
        //     }
        // }
        // System.out.println("Largest element in the array: "+largest);

        // smallest element in the array
        // int smallest=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++)
        // {
        //     if(a[i]<smallest)
        //     {
        //         smallest=a[i];
        //     }
        // }
        // System.out.println("Smallest element in the array: "+smallest);

        // reverse of the array
        // for(int i=n-1;i>=0;i--)
        // {
        //     System.out.print(a[i]+" ");
        // }

        // Even and Odd count in the array
        // int evenCount=0;
        // int OddCount=0;
        // for(int i=0;i<n;i++)
        // {
        //     if(a[i]%2==0)
        //     {
        //         evenCount++;
        //     }
        //     else
        //     {
        //         OddCount++;
        //     }
        // }
        // System.out.println("Even count: "+evenCount);
        // System.out.println("Odd count: "+OddCount);

        // Second largest element in the array
        // int largest=Integer.MIN_VALUE;
        // int secondLargest=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++)
        // {
        //     if(a[i]>largest)
        //     {
        //         secondLargest=largest;
        //         largest=a[i];
        //     }
        //     else if(a[i]>secondLargest && a[i]!=largest)
        //     {
        //         secondLargest=a[i];
        //     }
        // }
        // System.out.println("Second largest element in the array: "+secondLargest);

        // Dupilcate elements in the array
        // Set<Integer> set=new HashSet<>();
        // for(int i=0;i<n;i++)
        // {
        //     if(set.contains(a[i]))
        //     {
        //         System.out.println("Duplicate element: "+a[i]);
        //     }
        // }

        // Frequency of each elements in the array
        // Map<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<n;i++)
        // {
        //     if(map.containsKey(a[i]))
        //     {
        //         map.put(a[i],map.get(a[i])+1);
        //     }
        //     else
        //     {
        //         map.put(a[i],1);
        //     }
        // }
        // System.out.println("Frequency of each element in the array: "+map);

        // Search for an element in the array
        // int s=scanner.nextInt();
        // for(int i=0;i<n;i++)
        // {
        //     if(a[i]==s)
        //     {
        //         System.out.println("Element found at index: "+i);
        //         System.out.println("Element found : "+a[i]);
        //         break;
        //     }
        // }

        // Merge two arrays
        // int m=scanner.nextInt();
        // int [] b=new int[m];
        // for(int i=0;i<m;i++)
        // {
        //     b[i]=scanner.nextInt();
        // }
        // // Merge two arrays
        // int [] c=new int[n+m];
        // for(int i=0;i<n;i++)
        // {
        //     c[i]=a[i];
        // }
        // for(int i=0;i<m;i++)
        // {
        //     c[n+i]=b[i];
        // }
        // for(int i=0;i<n+m;i++)
        // {
        //     System.out.print(c[i]+" ");
        // }

        // Reverse String 
        // String s=scanner.nextLine();
        // String rev="";
        // for(int i=s.length()-1;i>=0;i--)
        // {
        //     rev+=s.charAt(i);
        // }
        // System.out.println("Reverse of the string: "+rev);

        // Palindrome String
        // String s=scanner.nextLine();
        // int i=0;
        // int j=s.length()-1;
        // while(i<j)
        // {
        //     if(s.charAt(i)!=s.charAt(j))
        //     {
        //         System.out.println("Not a palindrome");
        //         return;
        //     }
        //     i++;
        //     j--;
        // }
        // System.out.println("It is a palindrome");

        // Vowel Count
        // String s=scanner.nextLine();
        // int count=0;
        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);
        //     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
        //         || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' 
        //     )
        //     {
        //         count++;
        //     }
            
        // }
        // System.out.println(count);

        Word Count
        String s=scanner.nextLine();
        String [] words=s.split(" ");
        System.out.println("Word count: "+words.length);

    }
}