package Set;
import java.util.*; 
public class AlphabeticsNameOrder 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number of names");
        int n=scan.nextInt();
        scan.nextLine();
        System.out.println("enter names");
        String arr[]=new String[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextLine();
        }
        
        TreeSet<String> set=new TreeSet<>();
        for(String word : arr)
        {
            set.add(word);
        }
        for(String word : set)
        {
            System.out.print(word+" ");
        }
    }
    
}

