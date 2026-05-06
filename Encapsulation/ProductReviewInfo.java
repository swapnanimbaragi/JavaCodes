package Encapsulation;
import java.util.Scanner;
public class ProductReviewInfo 
{
    private String productName;
    private String reviewerName;
    private int rating;
    private String reviewComment;
    public String getProductName() 
    {
        return productName;
    }

    public void setProductName(String productName) 
    {
        this.productName = productName;
    }   
    public String getReviewerName() 
    {
        return reviewerName;
    }
    public void setReviewerName(String reviewerName) 
    {
        this.reviewerName = reviewerName;
    }
    public int getRating() 
    {
        return rating;
    }
    public void setRating(int rating) 
    {
        this.rating = rating;
    }
    public String getReviewComment() 
    {
        return reviewComment;
    }
    public void setReviewComment(String reviewComment) 
    {
        this.reviewComment = reviewComment;
    }

    public static void main(String[] args) 
    {
        ProductReviewInfo review = new ProductReviewInfo();
        Scanner scanner = new Scanner(System.in);
        
        String productName=scanner.nextLine();
        String reviewerName=scanner.nextLine();
        int rating=scanner.nextInt();
        scanner.nextLine(); 
        String reviewComment=scanner.nextLine();
        
        review.setProductName(productName);
        review.setReviewerName(reviewerName);
        review.setRating(rating);
        review.setReviewComment(reviewComment);

        System.out.println("Product Name: " + review.getProductName());
        System.out.println("Reviewer Name: " + review.getReviewerName());
        System.out.println("Rating: " + review.getRating());
        System.out.println("Review Comment: " + review.getReviewComment());
    }
}
