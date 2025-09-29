import java.util.Scanner;
import java.lang.Math;

public class Beec1015 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double dx = x2 - x1;
        double dy = y2 - y1;

        double sumOfSquares = Math.pow(dx, 2) + Math.pow(dy, 2);
        double distance = Math.sqrt(sumOfSquares);

        System.out.printf("%.4f%n", distance);

        sc.close();
    }
}
