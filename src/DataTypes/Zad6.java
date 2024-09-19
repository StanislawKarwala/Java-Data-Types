package DataTypes;

/*
Write a Java program to compute the body mass index (BMI).

Test Data
Input weight in pounds: 452
Input height in inches: 72
Expected Output:
Body Mass Index is 61.30159143458721
*/

import java.util.Scanner;

public class Zad6 {
    public static void bodyMassIndex(int weight, int height){
        double bmi = 703 * weight / (Math.pow(height, 2));
        System.out.println("Body Mass Index is " + bmi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        int weight = sc.nextInt();
        System.out.println("Enter height in inches:");
        int height = sc.nextInt();

        bodyMassIndex(weight, height);
    }
}
