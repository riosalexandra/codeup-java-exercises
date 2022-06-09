import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {
        String cohort = "Go";
        String timeOfDay = "afternoon";
        byte week = 11;
        double someNumber = 123.425F;
//        System.out.printf("Good %s, %s!%n", timeOfDay, cohort);
//        System.out.printf("This is the %dth week of %s cohort.%n", week, cohort);
//        System.out.println("This is going to appear on another line");
//        System.out.printf("The chosen number is %-8.2f%n", someNumber);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a string:");
//        String userInput = scanner.nextLine();
////        System.out.println("Your input was " + userInput);
//        System.out.printf("Your input was %s", userInput);


        // Getting around the problem with the return key
        // Strategy # 1 : the ghost line


//        System.out.println("Enter an integer:");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered " + userInput);
//        String first;
//        String second;
//        System.out.println("Please enter a sentence: ");
//        String ghost = scanner.nextLine();
//        first = scanner.nextLine();
//        System.out.println("Please enter another sentence: ");
//        second = scanner.nextLine();
//        System.out.println("First sentence: " + first + "\n second sentence: " + second);

        // Strategy # 2: use nextLine and parse the integer

//        System.out.println("Enter an integer:");
//        int userInput = Integer.parseInt(scanner.nextLine());
//        System.out.println("You entered " + userInput);
//
//        String first;
//        String second;
//        System.out.println("Please enter a sentence: ");
//        first = scanner.nextLine();
//        System.out.println("Please enter another sentence: ");
//        second = scanner.nextLine();
//        System.out.println("First sentence: " + first + "\n second sentence: " + second);

        // Strategy # 3: concatenate a .next() to the .nextLine()
        System.out.println("Enter an integer:");
        int userInput = scanner.nextInt();
        System.out.println("You entered " + userInput);

        String first;
        String second;
        System.out.println("Please enter a sentence: ");
        first = scanner.next() + scanner.nextLine();
        System.out.println("Please enter another sentence: ");
        second = scanner.nextLine();
//        System.out.println("First sentence: " + first + "\n second sentence: " + second);
        System.out.printf("First sentence: %s%n", first);
        System.out.printf("Second sentence: %s%n", second);
    }
}
