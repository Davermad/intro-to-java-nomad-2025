import java.util.Scanner;

public class Beec1017 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double spentTimeHours = scanner.nextDouble();
        double averageSpeedKmH = scanner.nextDouble();

        final double FUEL_EFFICIENCY_KMPL = 12.0;

        double distanceKm = spentTimeHours * averageSpeedKmH;

        double litersNeeded = distanceKm / FUEL_EFFICIENCY_KMPL;

        System.out.printf("%.3f%n", litersNeeded);

        scanner.close();
    }
}