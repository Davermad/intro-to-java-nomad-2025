import java.util.Scanner;

public class Beec1007 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int D = scanner.nextInt();

            int DIFERENCA = (A * B) - (C * D);

            System.out.println("DIFERENCA = " + DIFERENCA);

        } catch (Exception e) {
            System.err.println("Произошла ошибка при чтении или обработке данных: " + e.getMessage());
        }
    }
}

