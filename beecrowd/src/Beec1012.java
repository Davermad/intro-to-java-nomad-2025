import java.util.Scanner;

public class Beec1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double pi = 3.14159;

        double triangle = (A * C) / 2.0;
        double circle = pi * Math.pow(C, 2);
        double trapezium = ((A + B) * C) / 2.0;
        double square = Math.pow(B, 2);
        double rectangle = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangle);
        System.out.printf("CIRCULO: %.3f%n", circle);
        System.out.printf("TRAPEZIO: %.3f%n", trapezium);
        System.out.printf("QUADRADO: %.3f%n", square);
        System.out.printf("RETANGULO: %.3f%n", rectangle);

        sc.close();
    }
}
