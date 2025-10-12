import java.util.Scanner;

public class Beec1038 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        scanner.close();

        double pricePerItem = 0.0;

        switch (x) {
            case 1:
                pricePerItem = 4.00;
                break;
            case 2:
                pricePerItem = 4.50;
                break;
            case 3:
                pricePerItem = 5.00;
                break;
            case 4:
                pricePerItem = 2.00;
                break;
            case 5:
                pricePerItem = 1.50;
                break;
            default:
                System.err.println("Código de produto inválido.");
                return;
        }

        double totalValue = pricePerItem * y;

        System.out.printf("Total: R$ %.2f%n", totalValue);
    }
}
