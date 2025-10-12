import java.util.Scanner;

public class Beec1044 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        scanner.close();

        boolean areMultiples;

        areMultiples = A % B == 0 || B % A == 0;

        if (areMultiples) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
