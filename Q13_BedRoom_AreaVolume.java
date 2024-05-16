// Room class with only the area method
/*
WAP to find the area and volume of a BedRoom by 
extending a Room class which contain only the area () method.
*/
class Room {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Room(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the room
    public double area() {
        return length * width;
    }
}

// Bedroom class extending Room class
class Bedroom extends Room {
    private double height;

    // Constructor to initialize length, width, and height
    public Bedroom(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    // Method to calculate the volume of the bedroom
    public double volume() {
        return area() * height;
    }
}

public class Q13_BedRoom_AreaVolume {
    public static void main(String[] args) {
        // Creating a Bedroom object with dimensions 10x12x8
        Bedroom bedroom = new Bedroom(10, 12, 8);

        // Calculating and printing the area and volume of the bedroom
        System.out.println("Area of the bedroom: " + bedroom.area() + " square feet");
        System.out.println("Volume of the bedroom: " + bedroom.volume() + " cubic feet");
    }
}
