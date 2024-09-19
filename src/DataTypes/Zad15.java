package DataTypes;

/*
Write a Java program to get the next floating-point adjacent to positive and negative infinity from a given floating/double number.
*/

public class Zad15 {
    public static void main(String[] args) {
        float floatNumber = 0.2f;
        System.out.println("\nInitial floating floatNumber: " + floatNumber);
        float nextDownFloat = Math.nextDown(floatNumber);
        float nextUpFloat = Math.nextUp(floatNumber);

        System.out.println("Float " + floatNumber + " next down is " + nextDownFloat);
        System.out.println("Float " + floatNumber + " next up is " + nextUpFloat);

        double doubleNumber = 0.2d;
        System.out.println("\nInitial double floatNumber: " + doubleNumber);
        double nextDownDouble = Math.nextDown(doubleNumber);
        double nextUpDouble = Math.nextUp(doubleNumber);

        System.out.println("Double " + doubleNumber + " next down is " + nextDownDouble);
        System.out.println("Double " + doubleNumber + " next up is " + nextUpDouble);
    }
}
