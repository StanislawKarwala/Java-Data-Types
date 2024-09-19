package DataTypes;

/*
Write a Java program to convert minutes into years and days.

Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days
*/

public class Zad4 {
    public static void minutesIntoYearsAndDays(int minutes){
        int years = minutes / (365 * 60 * 24);
        int days = (minutes / 60 / 24) % 365;

        System.out.printf("%d minutes is approximately %d years and %d days", minutes, years, days);
    }

    public static void main(String[] args) {
        minutesIntoYearsAndDays(3456789);
    }
}
