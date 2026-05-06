package Encapsulation;
import java.util.Scanner;
public class CarInfo {
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        CarInfo car = new CarInfo();
        Scanner scanner = new Scanner(System.in);
        String make=scanner.nextLine();
        String model=scanner.nextLine();
        int year=scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String color=scanner.nextLine();
        double price=scanner.nextDouble();
        car.setMake(make);
        car.setModel(model);
        car.setYear(year);
        car.setColor(color);
        car.setPrice(price);

        // car.setMake("Toyota");
        // car.setModel("Camry");
        // car.setYear(2020);
        // car.setColor("Red");
        // car.setPrice(25000.00);

        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Year: " + car.getYear());
        System.out.println("Car Color: " + car.getColor());
        System.out.println("Car Price: $" + car.getPrice());
    }
}
