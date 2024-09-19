package DataTypes;

/*
Write a Java program that reads a number and displays the square, cube, and fourth power.

Expected Output:
Square: .2f
Cube: .2f
Fourth power: 50625.00
*/

public class Zad8 {
    public static void main(String[] args) {
        double value = 4;

        System.out.printf("Square: %.2f%n", Math.pow(value, 2));
        System.out.printf("Cube: %.2f%n", Math.pow(value, 3));
        System.out.printf("Fourth power: %.2f%n", Math.pow(value, 4));
    }
}
