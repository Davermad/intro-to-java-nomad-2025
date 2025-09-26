import java.util.Scanner;
import java.io.IOException;

public class Beec1008 {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {

            int employeeNumber = scanner.nextInt();
            int workedHours = scanner.nextInt();
            double hourlyRate = scanner.nextDouble();
            double salary = workedHours * hourlyRate;

            System.out.println("NUMBER = " + employeeNumber);
            System.out.printf("SALARY = U$ %.2f\n", salary);

        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
