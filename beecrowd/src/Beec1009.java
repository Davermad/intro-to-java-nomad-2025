import java.util.Scanner;

public class Beec1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        double fixedSalary = sc.nextDouble();
        double salesTotal = sc.nextDouble();

        double finalSalary = fixedSalary + (salesTotal * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", finalSalary);

        sc.close();
    }
}

