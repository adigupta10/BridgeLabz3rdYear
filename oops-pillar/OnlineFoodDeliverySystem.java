//package Encapsulation;
abstract class FoodItem {
    private String itemId;
    private String name;
    private double price;

    public FoodItem(String itemId, String name, double price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }

    public String getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculateDiscount();

    public void displayDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

interface Deliverable {
    double calculateDeliveryFee();
    String getDeliveryDetails();
}

class FastFood extends FoodItem implements Deliverable {
    private double discountRate = 0.05;
    private double deliveryFee = 50;

    public FastFood(String itemId, String name, double price) {
        super(itemId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateDeliveryFee() {
        return deliveryFee;
    }

    @Override
    public String getDeliveryDetails() {
        return "FastFood Delivery: Flat Rs.50";
    }
}

class Beverage extends FoodItem implements Deliverable {
    private double discountRate = 0.10;
    private double deliveryFee = 30;

    public Beverage(String itemId, String name, double price) {
        super(itemId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateDeliveryFee() {
        return deliveryFee;
    }

    @Override
    public String getDeliveryDetails() {
        return "Beverage Delivery: Flat Rs.30";
    }
}

class Dessert extends FoodItem implements Deliverable {
    private double discountRate = 0.15;
    private double deliveryFee = 40;

    public Dessert(String itemId, String name, double price) {
        super(itemId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateDeliveryFee() {
        return deliveryFee;
    }

    @Override
    public String getDeliveryDetails() {
        return "Dessert Delivery: Flat Rs.40";
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] orders = {
            new FastFood("F101", "Burger", 200),
            new Beverage("B202", "Cold Coffee", 150),
            new Dessert("D303", "Chocolate Cake", 500)
        };

        for (FoodItem item : orders) {
            item.displayDetails();
            double discount = item.calculateDiscount();

            double deliveryFee = 0;
            String deliveryDetails = "Not Deliverable";

            if (item instanceof Deliverable) {
                Deliverable d = (Deliverable) item;
                deliveryFee = d.calculateDeliveryFee();
                deliveryDetails = d.getDeliveryDetails();
            }

            double finalPrice = item.getPrice() + deliveryFee - discount;

            System.out.println("Discount: " + discount);
            System.out.println("Delivery Fee: " + deliveryFee + " (" + deliveryDetails + ")");
            System.out.println("Final Price: " + finalPrice);
            System.out.println("----------------------------");
        }
    }
}
