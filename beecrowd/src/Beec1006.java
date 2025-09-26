import java.util.Scanner;

public class Beec1006 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            double gradeA = scanner.nextDouble();
            double gradeB = scanner.nextDouble();
            double gradeC = scanner.nextDouble();

            int weightA = 2;
            int weightB = 3;
            int weightC = 5;

            int totalWeight = weightA + weightB + weightC;

            double weightedSum = (gradeA * weightA) + (gradeB * weightB) + (gradeC * weightC);
            double average = weightedSum / totalWeight;

            String output = String.format("MEDIA = %.5f", average);
            System.out.println(output);

        } catch (Exception e) {
            System.err.println("Произошла ошибка при чтении или обработке данных: " + e.getMessage());
        }
    }
}
