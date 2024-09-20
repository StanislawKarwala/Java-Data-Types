package JavaEnumTypes;

/*
Write a Java program to create an enum called "DaysOfWeek" representing the days of the week.

Explanation:
The program defines an enum called Days_Of_Week with seven values representing each day of the week.
Inside the main method, we create a variable today of type Days_Of_Weekend assign it the value MONDAY.
Finally, we print the value of today using System.out.println(). Modify and use this enum as per your requirements.

Sample Output:
Today is MONDAY
*/

public class Zad1 {
    public enum DaysOfWeek{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.MONDAY;
        System.out.println("Today is " + day);
    }
}
