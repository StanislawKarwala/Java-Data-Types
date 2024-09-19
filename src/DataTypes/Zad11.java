package DataTypes;

/*
Write a Java program to test whether a given double/float value is a finite floating-point value or not.
*/

public class Zad11 {
    public static void main(String[] args) {
        double doubleValue = 123.1234;
        float floatValue = 987.654f;

        if (Double.isFinite(doubleValue)) {
            System.out.println(doubleValue + " is a finite double value.");
        } else {
            System.out.println(doubleValue + " is not a finite double value.");
        }

        if (Float.isFinite(floatValue)) {
            System.out.println(floatValue + " is a finite float value.");
        } else {
            System.out.println(floatValue + " is not a finite float value.");
        }
    }
}
