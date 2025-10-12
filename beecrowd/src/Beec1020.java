import java.util.Scanner;

public class Beec1020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalDays = scanner.nextInt();

        scanner.close();

        final int DAYS_PER_YEAR = 365;
        final int DAYS_PER_MONTH = 30;

        int years = totalDays / DAYS_PER_YEAR;

        int remainingDays = totalDays % DAYS_PER_YEAR;

        int months = remainingDays / DAYS_PER_MONTH;

        int days = remainingDays % DAYS_PER_MONTH;

        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");
    }
}