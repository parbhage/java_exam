// method overriding means methods of parents class will be present in sub class
/*
WAP to simulate the concept of Method overriding
*/

// Superclass
class Animal {
    // Method to make a sound
    public void makeSound() {
        System.out.println("Animal makes a generic sound.");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class Q14_MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        // Calling makeSound method on Animal object
        animal.makeSound(); // Output: Animal makes a generic sound.

        // Calling makeSound method on Dog object
        dog.makeSound(); // Output: Dog barks.
    }
}
