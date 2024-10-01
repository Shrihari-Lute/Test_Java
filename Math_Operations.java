import java.util.Scanner;

class MathOperation {
    // Data members
    double x;
    double y;
    double result;

    // Method to take input from user for x and y
    void init() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        x = s.nextDouble();
        System.out.print("Enter the value of y: ");
        y = s.nextDouble();
    }

    // Method for addition of x and y
    void add() {
        result = x + y;
    }

    // Method for multiplication of x and y
    void mul() {
        result = x * y;
    }

    // Method for x raised to the power of y
    void power() {
        result = Math.pow(x, y); // Using Math.pow to calculate x^y
    }

    // Method to display the result
    void display() {
        System.out.println("The result is: " + result);
    }

    public static void main(String[] args) {
        // Creating an object of the MathOperation class
        MathOperation operation = new MathOperation();

        // Initialize x and y
        operation.init();

        // Perform addition
        operation.add();
        System.out.print("After addition, ");
        operation.display();

        // Perform multiplication
        operation.mul();
        System.out.print("After multiplication, ");
        operation.display();

        // Perform power operation (x^y)
        operation.power();
        System.out.print("After raising x to the power of y, ");
        operation.display();
    }
}
