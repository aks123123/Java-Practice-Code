class Vehicle {
    String color;
    String quality;

    public void vehicleQuality() {
        System.out.println("Quality of Vehicle is " + quality);
    }
}

class Car extends Vehicle {
    public void carDetails() {
        System.out.println("Car is good and color of car is " + color);
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "Red";
        c1.quality = "Brand";
         
        c1.vehicleQuality();
        c1.carDetails();
    }
}
