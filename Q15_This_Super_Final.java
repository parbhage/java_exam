//super keyword to call parent class methods.
//Final keyword to restrict the use of variable, method, or class. Therefore, value once assigned to any variable can never be changed. 
//this refers to the current object and it is a reference variable.
/*
WAP to simulate the concept of 'final', 'super', 'this' keywords
*/

// Parent class
class Parent {
    final int MAX_VALUE = 100; // Final variable

    // Method with final keyword (cannot be overridden)
    final void display() {
        System.out.println("Parent class display method");
    }
}

// Child class
class Child extends Parent {
    // Attempting to override the final method will result in a compilation error
    /* void display() {
        System.out.println("Child class display method");
    } */

    void show() {
        int MAX_VALUE = super.MAX_VALUE; // Accessing final variable from superclass using super keyword
        System.out.println("Maximum value from Parent class: " + MAX_VALUE);
    }
}

// Another class demonstrating 'this' keyword
class MyClass {
    int value;

    MyClass(int value) {
        this.value = value; // Using 'this' keyword to refer to the current object's instance variable
    }

    void display() {
        int value = 20;
        System.out.println("Value inside method: " + value); // Local variable 'value'
        System.out.println("Value of instance variable: " + this.value); // Instance variable 'value'
    }
}

public class Q15_This_Super_Final {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();

        MyClass myObj = new MyClass(10);
        myObj.display();
    }
}
