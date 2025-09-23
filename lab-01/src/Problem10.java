public class Problem10 {
    public static void main(String[] args) {
        double kilometers = 14.0;
        double totalMinutes = 45 + 30.0 / 60;
        double hours = totalMinutes / 60.0;
        double miles = kilometers / 1.6;
        double speed = miles / hours;

        System.out.println("Average speed in miles per hour = " + speed);
    }
}
