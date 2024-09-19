package DataTypes;

/*
Write a Java program that reads a number in inches and converts it to meters.
Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters
*/

public class Zad2 {
    public static double inchesToMeters(double inch){
        return inch * 0.0254;
    }

    public static void main(String[] args) {
        double inches = 1000;
        System.out.printf("%.1f inch is %.1f meters", inches, inchesToMeters(inches));
    }
}
