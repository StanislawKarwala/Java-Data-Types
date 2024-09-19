package DataTypes;

/*
Write a Java program to compare two signed and unsigned numbers.
*/

public class Zad12 {
    public static void main(String[] args) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        System.out.println("Signed integers: " + a + ", " + b);

        int compareSigned = Integer.compare(a, b);
        System.out.println("Compare signed numbers: " + compareSigned);

        int compareUnsigned = Integer.compareUnsigned(a, b);
        System.out.println("Compare unsigned numbers: " + compareUnsigned);
    }
}
