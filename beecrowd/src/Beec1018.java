import java.util.Scanner;

public class Beec1018 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int originalValue = N;

        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(originalValue);

        for (int note : banknotes) {
            int count = N / note;
            N = N % note;

            System.out.printf("%d nota(s) de R$ %d,00%n", count, note);
        }

        scanner.close();
    }
}