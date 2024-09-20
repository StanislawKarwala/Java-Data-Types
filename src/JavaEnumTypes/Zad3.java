package JavaEnumTypes;

/*
Write a Java program to implement an enum called "Shape" with constants representing different geometric shapes.

Explanation:
We implement an enum called Shape with five values representing geometric shapes:
CIRCLE, SQUARE, TRIANGLE, RECTANGLE, and HEXAGON. We create two variables, shape1 and shape2, both of type Shape,
and assign them the values CIRCLE and SQUARE. Finally, we print the values of shape1 and shape2 using System.out.println().

Sample Output:
First shape: CIRCLE
Second shape: SQUARE
*/

public class Zad3 {
    public enum Shape{
        CIRCLE,
        SQUARE,
        TRIANGLE,
        RECTANGLE,
        HEXAGON
    }

    public static void main(String[] args) {
        Shape shape1 = Shape.CIRCLE;
        Shape shape2 = Shape.SQUARE;

        System.out.println("First shape: " + shape1);
        System.out.println("Second shape: " + shape2);
    }
}
