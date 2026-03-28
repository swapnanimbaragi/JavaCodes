package SubStrings;
class reveser
{
    public static void main(String[] args)
    {
        String s="India is my country";
        // String arr[]=s.split(" ");
        // String rev="";
        // for(int i=arr.length-1;i>=0;i--)
        // {
        //     char ch=s.charAt(i);
        //     rev=rev+ch;
        //     rev=rev+arr[i];
            
        // }
        // System.out.print(rev);
    
        String arr[]=s.split(" ");
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
            {
                rev=rev+s.charAt(i);
            }
            System.out.print(rev+" ");

    }
}