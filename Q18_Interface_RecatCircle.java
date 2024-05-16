/*
Create an interface Area with the following details:

Data Membet; 
a) float Pi-3.14f

Methods
a) float compute (float x, float y)


Implement the above interface in two different classes Rectangle and Circle.
*/
// Interface Area
interface Area {
    // Data Member
    float Pi = 3.14f;

    // Method to compute area
    float compute(float x, float y);
}

// Class Rectangle implementing Area interface
class Rectangle implements Area {
    // Method implementation for computing area of a rectangle
    @Override
    public float compute(float x, float y) {
        return x * y;
    }
}

// Class Circle implementing Area interface
class Circle implements Area {
    // Method implementation for computing area of a circle
    @Override
    public float compute(float x, float y) {
        return Pi * x * x;
    }
}

public class Q18_Interface_RecatCircle {
    public static void main(String[] args) {
        // Creating objects of Rectangle and Circle
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        // Computing and displaying area of rectangle
        float rectangleArea = rectangle.compute(5, 10);
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Computing and displaying area of circle
        float circleArea = circle.compute(5, 0); // Y parameter is not used for circle, so it can be set to any value
        System.out.println("Area of Circle: " + circleArea);
    }
}
