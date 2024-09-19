package DataTypes;

/*
Write a Java program that accepts two integers from the user and prints the sum, the difference,
the product, the average, the distance (the difference between the integers),
the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).

Test Data
Input 1st integer: 25
Input 2nd integer: 5
Expected Output :
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
Average of two integers: 15.00
Distance of two integers: 20
Max integer: 25
Min integer: 5
*/

public class Zad9 {
    public static void operations(int a, int b){
        System.out.println("Sum of two integers: " + (a+b));
        System.out.println("Difference of two integers: " + (a-b));
        System.out.println("Product of two integers: " + a * b);
        System.out.println("Average of two integers: " + ((a+b)/2));
        System.out.println("Distance of two integers: " + Math.abs(a - b));
        System.out.println("Max integer: " + Math.max(a, b));
        System.out.println("Min integer: " + Math.min(a, b));
    }

    public static void main(String[] args) {
        int a = 25;
        int b = 5;

        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        operations(a, b);

    }
}
