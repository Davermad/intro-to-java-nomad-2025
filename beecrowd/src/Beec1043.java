import java.util.Scanner;
public class Beec1043 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        scanner.close();

        boolean isTriangle = (A + B > C) && (A + C > B) && (B + C > A);


        if (isTriangle) {
            double perimeter = A + B + C;

            System.out.printf("Perimetro = %.1f%n", perimeter);

        } else {
            double areaTrapezium = ((A + B) * C) / 2.0;

            System.out.printf("Area = %.1f%n", areaTrapezium);
        }
    }
}