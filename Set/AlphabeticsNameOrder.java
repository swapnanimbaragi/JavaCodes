package Set;
import java.util.*; 
public class AlphabeticsNameOrder 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextLine();
        }
        
        LinkedHashSet<String> set=new LinkedHashSet<>();
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

