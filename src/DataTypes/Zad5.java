package DataTypes;

/*
Write a Java program that prints the current time in GMT.

Test Data
Input the time zone offset to GMT: 256
Expected Output:
Current time is 23:40:24
*/

public class Zad5 {
    public static void currentTime(int timeZone){
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = ((totalHours + timeZone) % 24);
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }

    public static void main(String[] args) {
        int timeZone = 24;
        currentTime(timeZone);
    }
}
