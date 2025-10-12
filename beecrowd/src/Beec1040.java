import java.util.Scanner;

public class Beec1040 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double N1 = scanner.nextDouble();
        double N2 = scanner.nextDouble();
        double N3 = scanner.nextDouble();
        double N4 = scanner.nextDouble();

        final double W1 = 2.0;
        final double W2 = 3.0;
        final double W3 = 4.0;
        final double W4 = 1.0;

        double weightedSum = (N1 * W1) + (N2 * W2) + (N3 * W3) + (N4 * W4);
        double totalWeights = W1 + W2 + W3 + W4; // 2 + 3 + 4 + 1 = 10

        double average = weightedSum / totalWeights;

        System.out.printf("Media: %.1f%n", average);

        if (average >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (average < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");

            double examScore = scanner.nextDouble();

            System.out.printf("Nota do exame: %.1f%n", examScore);

            double finalAverage = (average + examScore) / 2.0;

            if (finalAverage >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", finalAverage);
        }
        scanner.close();
    }
}
