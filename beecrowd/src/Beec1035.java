import java.util.Scanner;

public class Beec1035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        scanner.close();

        boolean condition1 = (B > C);
        boolean condition2 = (D > A);
        boolean condition3 = (C + D) > (A + B);
        boolean condition4 = (C > 0) && (D > 0);
        boolean condition5 = (A % 2 == 0);

        if (condition1 && condition2 && condition3 && condition4 && condition5) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
