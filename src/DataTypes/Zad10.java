package DataTypes;

/*
Write a Java program to break an integer into a sequence of digits.

Test Data
Input six non-negative digits: 123456
Expected Output :
1 2 3 4 5 6
*/

public class Zad10 {
    public static void sequenceOfDigits(int number){
        String str = String.valueOf(number);
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        sequenceOfDigits(123456);
    }
}
