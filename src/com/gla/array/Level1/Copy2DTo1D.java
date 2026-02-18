package com.gla.array.Level1;

import java.util.Scanner;

public class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        
        // Create 2D array (Matrix)
        int[][] matrix = new int[rows][columns];
        
        // Take user input for matrix elements
        System.out.println("\nEnter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // Display the 2D array
        System.out.println("\n2D Array (Matrix):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Create 1D array of size rows * columns
        int[] array = new int[rows * columns];
        
        // Copy elements from 2D to 1D array
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }
        
        // Display the 1D array
        System.out.println("\n1D Array (copied from 2D array):");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
