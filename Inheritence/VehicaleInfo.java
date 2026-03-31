package Inheritence;
import java.util.*;
class Vehicle
{
    private String brand;
    private String model;
    

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getInfo()
    {
        return "Brand: " + brand + ", Model: " + model;
    }
}
class Car extends Vehicle
{
    private int seats;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Number of Seats: " + seats;
    }
}
class Bike extends Vehicle
{
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Type: " + type;
    }
}
public class VehicaleInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type=scan.next().trim();
        scan.nextLine();
        if(type.equalsIgnoreCase("Car"))
        {
            String data[]=scan.nextLine().split(",");
            Car car = new Car();
            car.setBrand(data[0]);
            car.setModel(data[1]);
            car.setSeats(Integer.parseInt(data[2]));
            System.out.println("Vehicle Info: " + car.getInfo());
        }
        else if (type.equalsIgnoreCase("Bike"))
        {
            String data[]=scan.nextLine().split(",");
            Bike bike = new Bike();
            bike.setBrand(data[0]);
            bike.setModel(data[1]);
            bike.setType(data[2]);
            System.out.println("Vehicle Info: " + bike.getInfo());
        }
    }
}
