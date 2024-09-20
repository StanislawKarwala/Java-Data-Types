package JavaEnumTypes;

/*
Write a Java program to create an enum called "Weekend" with constants representing the days of the weekend.

Explanation:
In the above exercise, we define an enum called Weekend with two values representing the weekend days, SATURDAY and SUNDAY.
Inside the main method, we create two variables, day1 and day2, both of type Weekend,
and assign them the respective values of SATURDAY and SUNDAY. Finally, we print day1 and day2 values using System.out.println().

Sample Output:
First day of the weekend: SATURDAY
Second day of the weekend: SUNDAY
*/

public class Zad2 {
    public enum Weekend{
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        Weekend day1 = Weekend.SATURDAY;
        Weekend day2 = Weekend.SUNDAY;

        System.out.println("First day of the weekend: " + day1);
        System.out.println("Second day of the weekend: " + day2);
    }
}
