import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
//        System.out.println("Hello, " + name);
        System.out.printf("Hello, %s", name);
    }
}
