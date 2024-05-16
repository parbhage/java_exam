/*
Write a menu driven program to display the resultant 
matrix after addition and subtraction of two matrices
*/

import java.util.Scanner;

public class Q19_MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for the matrices:");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        // Input matrices
        int[][] matrix1 = inputMatrix(rows, columns, "first");
        int[][] matrix2 = inputMatrix(rows, columns, "second");

        // Display menu and perform operations
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Matrices");
            System.out.println("2. Subtract Matrices");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayResult(addMatrices(matrix1, matrix2));
                    break;
                case 2:
                    displayResult(subtractMatrices(matrix1, matrix2));
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter again.");
            }
        }
    }

    // Method to input a matrix
    public static int[][] inputMatrix(int rows, int columns, String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements for " + name + " matrix:");
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to display a matrix
    public static void displayResult(int[][] matrix) {
        System.out.println("Resultant Matrix:");
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
