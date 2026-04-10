package Practice;
import java.util.*; 
public class LastSecondDigitOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int lastSecondDigit = (n / 10) % 10; // Get the last second digit
        System.out.println(lastSecondDigit);
    }
}
