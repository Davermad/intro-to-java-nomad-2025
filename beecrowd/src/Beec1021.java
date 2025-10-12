import java.util.Scanner;

public class Beec1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double N = scanner.nextDouble();

        scanner.close();

        int totalCents = (int) Math.round(N * 100);

        int[] noteValues = {10000, 5000, 2000, 1000, 500, 200};

        int[] coinValues = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");

        int remainingCents = totalCents;

        for (int noteCents : noteValues) {
            int count = remainingCents / noteCents;

            remainingCents %= noteCents;

            double noteValueReal = (double) noteCents / 100.0;
            System.out.printf("%d nota(s) de R$ %.2f%n", count, noteValueReal);
        }

        System.out.println("MOEDAS:");

        for (int coinCents : coinValues) {
            int count = remainingCents / coinCents;

            remainingCents %= coinCents;

            double coinValueReal = (double) coinCents / 100.0;
            System.out.printf("%d moeda(s) de R$ %.2f%n", count, coinValueReal);
        }
    }
}
