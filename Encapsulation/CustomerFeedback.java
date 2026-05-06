package Encapsulation;
import java.util.Scanner;
public class CustomerFeedback {
    private String customerName;
    private String feedback;
    private int rating;
    private String email;
    private String phoneNumber;

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }   
    public String getFeedback() {
        return feedback;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        CustomerFeedback feedback = new CustomerFeedback();
        Scanner scanner = new Scanner(System.in);
        
        String customerName=scanner.nextLine();
        String feedbackText=scanner.nextLine();
        int rating=scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String email=scanner.nextLine();
        String phoneNumber=scanner.nextLine();
        
        feedback.setCustomerName(customerName);
        feedback.setFeedback(feedbackText);
        feedback.setRating(rating);
        feedback.setEmail(email);
        feedback.setPhoneNumber(phoneNumber);

        System.out.println("Customer Name: " + feedback.getCustomerName());
        System.out.println("Feedback: " + feedback.getFeedback());
        System.out.println("Rating: " + feedback.getRating());
        System.out.println("Email: " + feedback.getEmail());
        System.out.println("Phone Number: " + feedback.getPhoneNumber());
    }
}
