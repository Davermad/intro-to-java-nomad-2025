import java.util.Scanner;

public class Beec1019 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        scanner.close();

        int hours = N / 3600;

        N = N % 3600;

        int minutes = N / 60;

        int seconds = N % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}