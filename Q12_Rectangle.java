/*
WAP to calculate the area of a rectangle using overloaded 
constructor depending on different combination of 
inputs for the sides of the rectangle.
*/
// constructor overload means same variablre name but different datatype

public class Q12_Rectangle {
    private double length;
    private double width;

    // Constructor with no arguments
    public Q12_Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    // Constructor with one argument (assuming square)
    public Q12_Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    // Constructor with two arguments (length and width)
    public Q12_Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Q12_Rectangle rect1 = new Q12_Rectangle(); // Using default constructor
        Q12_Rectangle rect2 = new Q12_Rectangle(5); // Square with side 5
        Q12_Rectangle rect3 = new Q12_Rectangle(4, 6); // Rectangle with length 4 and width 6

        System.out.println("Area of rect1 (default): " + rect1.calculateArea());
        System.out.println("Area of rect2 (square): " + rect2.calculateArea());
        System.out.println("Area of rect3 (rectangle): " + rect3.calculateArea());
    }
}
