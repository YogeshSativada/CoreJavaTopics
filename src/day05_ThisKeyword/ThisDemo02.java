package day05_ThisKeyword;

class Car {
    private String model;
    
    public void setModel(String model) {
        // Using 'this' to call another method in the same class
        this.model = model;
        this.displayModel();
    }

    public void displayModel() {
        System.out.println("Car Model: " + model);
    }
}

public class ThisDemo02 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Tesla Model S");
    }
}

