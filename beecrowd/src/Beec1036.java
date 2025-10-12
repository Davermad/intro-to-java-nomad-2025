import java.util.Scanner;

public class Beec1036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        scanner.close();

        double delta = (B * B) - (4.0 * A * C);

        if (A == 0.0) {
            System.out.println("Impossivel calcular");
            return;
        }

        if (delta < 0.0) {
            System.out.println("Impossivel calcular");
            return;
        }

        double sqrtDelta = Math.sqrt(delta);

        double R1 = (-B + sqrtDelta) / (2.0 * A);

        double R2 = (-B - sqrtDelta) / (2.0 * A);

        System.out.printf("R1 = %.5f%n", R1);
        System.out.printf("R2 = %.5f%n", R2);
    }
}