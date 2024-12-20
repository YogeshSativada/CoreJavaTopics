package day07_Constructor;

class Bike {
    String brand;
    int year;

    // Default constructor
    public Bike() {
        brand = "Unknown";
        year = 0;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class ConstructorDemo01 {
    public static void main(String[] args) {
    	Bike car1 = new Bike(); // Calls the default constructor
        car1.displayInfo();
    }
}





