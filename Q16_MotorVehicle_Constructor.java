/*
Define a class Motor Vehicle as described below:

Data Members:

modelName b) model Number

a)

c) modelPrice

Methods:

a) display(): to display model name, price and model number

Define another class named Car that inherits the class Motor Vehicle and has the following Data Members:

a) discountRate

Methods:

a) display(): to display car name, model no, price, discount rate

b) discount(): to compute the discount

Create the classes Motor Vehicle and Car with suitable constructor and test it.
*/

class MotorVehicle {
    // Data Members
    protected String modelName;
    protected int modelNumber;
    protected double modelPrice;

    // Constructor
    public MotorVehicle(String modelName, int modelNumber, double modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }

    // Method to display model name, price, and model number
    public void display() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Model Price: " + modelPrice);
    }
}

class Car extends MotorVehicle {
    // Data Member
    private double discountRate;

    // Constructor
    public Car(String modelName, int modelNumber, double modelPrice, double discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }

    // Method to compute the discount
    public double discount() {
        return modelPrice * (discountRate / 100);
    }

    // Method to display car name, model no, price, and discount rate
    @Override
    public void display() {
        super.display();
        System.out.println("Discount Rate: " + discountRate + "%");
    }
}

public class Q16_MotorVehicle_Constructor {
    public static void main(String[] args) {
        // Creating an instance of Car
        Car car = new Car("Toyota Camry", 2023, 25000.0, 10.0);

        // Displaying the details of the car
        car.display();

        // Computing and displaying the discount
        System.out.println("Discount: $" + car.discount());
    }
}
