import java.util.Scanner;

class Circle {
    // Data members
    double radius;
    double area;

    // Method to initialize radius from user input
    void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
    }

    // Method to calculate the area of the circle
    void calc() {
        area = Math.PI * radius * radius; // Area formula: π * r²
    }

    // Method to display the area of the circle
    void display() {
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }

    public static void main(String[] args) {
        // Creating an object of the Circle class
        Circle circle = new Circle();

        // Calling methods to initialize, calculate, and display area
        circle.init();
        circle.calc();
        circle.display();
    }
}
