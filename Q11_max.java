/*
WAP to calculate the maximum value for different
 combination of inputs with an overloaded max () method.
*/
// mathod overload means same variablre name but different datatype
public class Q11_max {
    // Method to find the maximum value between two integers
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    // Method to find the maximum value between three integers
    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    // Method to find the maximum value between two doubles
    public static double max(double a, double b) {
        return a > b ? a : b;
    }

    // Method to find the maximum value between three doubles
    public static double max(double a, double b, double c) {
        return max(max(a, b), c);
    }

    public static void main(String[] args) {
        // Testing integer overloadings
        System.out.println("Max between 10 and 20: " + max(10, 20));
        System.out.println("Max between 30, 40, and 50: " + max(30, 40, 50));

        // Testing double overloadings
        System.out.println("Max between 12.5 and 15.7: " + max(12.5, 15.7));
        System.out.println("Max between 10.3, 8.9, and 11.1: " + max(10.3, 8.9, 11.1));
    }
}
