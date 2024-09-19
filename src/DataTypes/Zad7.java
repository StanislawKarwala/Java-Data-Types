package DataTypes;

/*
Write a Java program to take the user for a distance (in meters) and the time taken
(as three numbers: hours, minutes, seconds), and display the speed, in meters per second,
kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).

Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804
*/

public class Zad7 {
    public static void speed(float meters, float hours, float minutes, float seconds){
        double sumSeconds = hours * 3600 + minutes * 60 + seconds;
        double metersSecond = meters / sumSeconds;
        double kmHours = (meters/1000 ) / (sumSeconds/3600);
        double milesHours = kmHours / 1.609f;
        System.out.printf("Your speed in meters/second is %.8f%n", metersSecond);
        System.out.printf("Your speed in km/h is %.8f%n", kmHours);
        System.out.printf("Your speed in miles/h is %.8f%n", milesHours);
    }

    public static void main(String[] args) {
        float meters = 2500;
        float hours = 5;
        float minutes = 56;
        float seconds = 23;

        System.out.printf("Meters:%.0f hours:%.0f minutes:%.0f seconds:%.0f%n", meters, hours, minutes, seconds);
        speed(meters, hours, minutes, seconds);

    }
}
