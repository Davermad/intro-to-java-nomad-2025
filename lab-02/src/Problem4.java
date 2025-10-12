import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String age = scanner.next();
        String city = scanner.next();

        System.out.println("My name is " + name + ", I am " + age + " years old, I live in " + city);
    }
}