import java.util.Scanner;

public class Beec1037 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value = scanner.nextDouble();

        scanner.close();

        String result;

        if (value < 0.0 || value > 100.0) {
            result = "Fora de intervalo";
        }

        else if (value <= 25.0) {
            result = "Intervalo [0,25]";
        }

        else if (value <= 50.0) {
            result = "Intervalo (25,50]";
        }

        else if (value <= 75.0) {
            result = "Intervalo (50,75]";
        }

        else {
            result = "Intervalo (75,100]";
        }

        System.out.println(result);
    }
}