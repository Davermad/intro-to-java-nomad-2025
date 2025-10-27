import java.util.Scanner;

public class Beec1060 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;

        double currentNumber;

        for (int i = 0; i < 6; i++) {
            currentNumber = sc.nextDouble();

            if (currentNumber > 0){
                positiveCount++;
            }
        }
        System.out.println(positiveCount);
        sc.close();
    }
}
