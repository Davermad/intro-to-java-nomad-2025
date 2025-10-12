import java.util.Scanner;

public class Beec1016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanceKm;

        try {
            distanceKm = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.err.println("Invalid input. Please enter an integer value for the distance.");
            return;
        } finally {
            scanner.close();
        }

        int totalTimeMinutes = distanceKm * 2;
        System.out.println(totalTimeMinutes + " minutos");
    }
}

