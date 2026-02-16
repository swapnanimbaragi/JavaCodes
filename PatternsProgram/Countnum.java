package Codes.PatternsProgram;

public class Countnum {
    public static void main(String...args){
    int count=1;
    int n=5;
    for(int i=0;i<n;i++)
    {
        for(int j=0; j<n; j++)
        {
            if(count<10)
            {
                System.out.print("0");           
            }
            System.out.print(count++ +" ");
        }
        System.out.println();
    }
}
}
