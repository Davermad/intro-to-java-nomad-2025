import java.util.Scanner;

public class Beec1041 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        scanner.close();

        String position;

        if (x == 0.0 && y == 0.0) {
            position = "Origem";
        }
        else if (x == 0.0) {
            position = "Eixo Y";
        } else if (y == 0.0) {
            position = "Eixo X";
        }
        else if (x > 0.0 && y > 0.0) {
            position = "Q1";
        }
        else if (x < 0.0 && y > 0.0) {
            position = "Q2";
        }
        else if (x < 0.0 && y < 0.0) {
            position = "Q3";
        }
        else {
            position = "Q4";
        }

        System.out.println(position);
    }
}
