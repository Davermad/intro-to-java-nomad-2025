import java.util.Scanner;

public class Beec1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code1 = sc.nextInt();
        int units1 = sc.nextInt();
        double price1 = sc.nextDouble();

        int code2 = sc.nextInt();
        int units2 = sc.nextInt();
        double price2 = sc.nextDouble();

        double total = (units1 * price1) + (units2 * price2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}
