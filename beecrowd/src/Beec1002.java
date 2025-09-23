// Second Task
import java.util.Scanner;
import java.lang.Math;

public class Beec1002 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;

        System.out.println("Площадь круга: " + area);
    }
}