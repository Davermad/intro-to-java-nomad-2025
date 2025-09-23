public class Problem04 {
    public static void main(String[] args) {
        System.out.println("a   a^2   a^3");
        for (int i = 1; i <= 4; i++) {
            System.out.printf("%-3d %-5d %-5d%n", i, i * i, i * i * i);
        }
    }
}

