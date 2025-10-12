import java.util.Scanner;
import java.util.Arrays;

public class Beec1042 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        scanner.close();

        int[] sortedArray = new int[3];
        sortedArray[0] = A;
        sortedArray[1] = B;
        sortedArray[2] = C;

        Arrays.sort(sortedArray);

        System.out.println(sortedArray[0]);
        System.out.println(sortedArray[1]);
        System.out.println(sortedArray[2]);

        System.out.println();

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}