package DataTypes;

/*
Write a Java program to compute the floor division and floor modulus of the given dividend and divisor.
*/

public class Zad13 {
    public static void main(String[] args) {
        int a = -123;
        int b = 1456;

        System.out.println("Floor division using '/' operator: " + (a / b));
        System.out.println("Floor division using floorDiv() method is: " + Math.floorDiv(a, b));
        System.out.println();
        System.out.println("Floor modulus using '%' operator: " + (a % b));
        System.out.println("Floor modulus using floorMod() method is: " + Math.floorMod(a, b));
    }
}
