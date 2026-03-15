package Encapsulation;

public class ProductInventryManegment {
    private String productName;
    private String productId;       
    private int quantity;
    private double price;
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
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
        product.setProductName("Laptop");
        product.setProductId("P12345");
        product.setQuantity(10);
        product.setPrice(999.99);

        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Price: $" + product.getPrice());
    }
    
}
