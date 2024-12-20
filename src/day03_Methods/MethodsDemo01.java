package day03_Methods;

public class MethodsDemo01 {

    // Static method
    public static void displayStaticMessage() {
        System.out.println("This is a static method.");
    }

    // Non-static method
    public void displayNonStaticMessage() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        // Calling the static method without creating an object
        MethodsDemo01.displayStaticMessage();

        // Creating an object to call the non-static method
        MethodsDemo01 example = new MethodsDemo01();
        example.displayNonStaticMessage();
    }
}

