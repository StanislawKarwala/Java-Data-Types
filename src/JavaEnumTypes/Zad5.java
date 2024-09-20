package JavaEnumTypes;

/*
Write a Java program that defines an enum called "Months" with constants representing the months of the year.

The above program defines an enum called Months with twelve values representing the months of the year:
JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, and DECEMBER.
Inside the main method, we create a variable currentMonth of type Months and assign it the value MAY.
Finally, we print currentMonth's value using System.out.println().

Sample Output:
Current month: MAY
*/

public class Zad5 {
    public enum Months{
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }
    public static void main(String[] args) {
        Months currentMonth = Months.MAY;
        System.out.println("Current month: " + currentMonth);
    }
}
