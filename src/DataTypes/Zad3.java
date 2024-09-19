package DataTypes;

/*
Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16
*/

import java.util.Scanner;

public class Zad3 {
    public static int digitsInInteger(int number){
        int sum = 0;
        while(number != 0){
            sum = sum + number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer between 0 and 1000: ");
        int number = sc.nextInt();
        System.out.println("The sum of all digits in " + number + " is " + digitsInInteger(number));
    }
}
