
package Encapsulation;
import java.util.Scanner;
public class ProductInventryManegment 
{
    private String productName;
    private String productId;       
    private int quantity;
    private double price;
    public String getProductName() 
    {
        return productName;
    }
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public static void main(String[] args) {
        ProductInventryManegment product = new ProductInventryManegment();
        Scanner scanner = new Scanner(System.in);
        String productName=scanner.nextLine();
        String productId=scanner.nextLine();
        int quantity=scanner.nextInt();
        double price=scanner.nextDouble();
        product.setProductName(productName);
        product.setProductId(productId);
        product.setQuantity(quantity);
        product.setPrice(price);

        // product.setProductName("Laptop");
        // product.setProductId("P12345");
        // product.setQuantity(10);
        // product.setPrice(999.99);

        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Price: $" + product.getPrice());
    }
    
}
