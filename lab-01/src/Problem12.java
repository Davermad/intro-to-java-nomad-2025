public class Problem12 {
    public static void main(String[] args) {
        double kilometers = 24.0;
        double totalSeconds = 1 * 3600 + 40 * 60 + 35;
        double hours = totalSeconds / 3600.0;
        double speed = kilometers / hours;

        System.out.println("Average speed in km/h = " + speed);
    }
}
