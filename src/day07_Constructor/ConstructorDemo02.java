package day07_Constructor;

class Bus {
    String brand;
    int year;

    // Parameterized constructor
    public Bus(String brand, int year) {
        this.brand = brand;  // this.brand refers to the instance variable
        this.year = year;    // this.year refers to the instance variable
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class ConstructorDemo02 {
    public static void main(String[] args) {
    	Bus car1 = new Bus("Toyota", 2020); // Calls the parameterized constructor
        car1.displayInfo();
    }
}

