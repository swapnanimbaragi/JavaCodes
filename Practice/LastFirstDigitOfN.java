package Practice;
import java.util.*; 
public class LastFirstDigitOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int lastFirstDigit = n % 10; // Get the last first digit
        System.out.println(lastFirstDigit);
    }
}
