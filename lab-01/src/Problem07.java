public class Problem07 {
    public static void main(String[] args) {
        double pi1 = 4.0 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11);
        double pi2 = 4.0 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);

        System.out.println("PI (6 terms) = " + pi1);
        System.out.println("PI (7 terms) = " + pi2);
    }
}
