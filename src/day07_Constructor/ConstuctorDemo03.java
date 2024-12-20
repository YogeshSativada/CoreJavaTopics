package day07_Constructor;

class Car {
    String brand;
    int year;

    // Default constructor
    public Car() {
        brand = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    public Car(String brand) {
        this.brand = brand;
        this.year = 0;
    }

    // Parameterized constructor with both brand and year
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class ConstuctorDemo03 {
    public static void main(String[] args) {
        Car car1 = new Car(); // Calls default constructor
        car1.displayInfo();

        Car car2 = new Car("Honda"); // Calls parameterized constructor with brand
        car2.displayInfo();

        Car car3 = new Car("Ford", 2022); // Calls parameterized constructor with brand and year
        car3.displayInfo();
    }
}
