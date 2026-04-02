package Practice;
import java.util.*;
public class VotingEligiblity {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String hasVotingCard = sc.next();   
        if(age>=18 && hasVotingCard.equalsIgnoreCase("yes"))
        {
            System.out.println("You are eligible to vote.");
        }
        
        else if(age>=18 && hasVotingCard.equalsIgnoreCase("no"))
        {
            System.out.println("Get a voting card.");
        }
        else
        {
            System.out.println("You are not eligible to vote.");
        }
        
    }
}
