package DataTypes;

/*
Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
*/

public class Zad1 {
    public static double fahrenheitToCelsius(double degree){
        return (degree - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double degree = 212.0;
        System.out.printf("%.1f degree Fahrenheit is equal to %.1f in Celsius", degree, fahrenheitToCelsius(degree));
    }
}
