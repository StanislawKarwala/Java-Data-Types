package DataTypes;

/*
Write a Java program to extract the primitive type value from a given BigInteger value.
A primitive type is predefined by the language and is named by a reserved keyword.
Primitive values do not share state with other primitive values.
The eight primitive data types supported by the Java  programming language are byte, short, int, long, float, double, Boolean and char.
BigInteger() translates the sign-magnitude representation of a BigInteger into a BigInteger.
The sign is represented as an integer signum value: -1 for negative, 0 for zero, or 1 for positive.
The magnitude is a byte array in big-endian byte-order: the most significant byte is in the zeroth element.
A zero-length magnitude array is permissible, and will result in a BigInteger value of 0, whether signum is -1, 0 or 1.
*/

import java.math.BigInteger;

public class Zad14 {
    public static void main(String[] args) {
        BigInteger bigValue = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println("BigInteger value: " + bigValue);

        long longValue = bigValue.longValue();
        System.out.println("Convert the said BigInteger to long value: " + longValue);

        int intValue = bigValue.intValue();
        System.out.println("Convert the said BigInteger to int value: " + intValue);

        short shortValue = bigValue.shortValue();
        System.out.println("Convert the said BigInteger to short value: " + shortValue);

        byte byteValue = bigValue.byteValue();
        System.out.println("Convert the said BigInteger to byte: " + byteValue);

        long exactLongValue = bigValue.longValueExact();
        System.out.println("Convert the said BigInteger to exact long: " + exactLongValue);
    }
}
