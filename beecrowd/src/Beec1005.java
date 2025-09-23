// Fifth task
import java.util.Scanner;

public class Beec1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double WEIGHT_A = 3.5;
        final double WEIGHT_B = 7.5;

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double MEDIA = (A * WEIGHT_A + B * WEIGHT_B) / (WEIGHT_A + WEIGHT_B);

        System.out.printf("MEDIA = %.5f%n", MEDIA);
        scanner.close();
    }
}