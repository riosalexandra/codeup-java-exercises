public class ControlStatementsAndLoopsLecture {

    public static void main(String[] args) {

        // The fundamental programming components:
        // 1. Statements, or "Do something"
//        System.out.println("Output this");
        // 2. Decisions (or conditionals)
        // or, "do something under a certain condition"
        // 3. Loops
        // or, "do something again and again"

//        short x = 30001;
//
//
//
//        if (x <  0){
//            System.out.println("The variable x is negative");
//        } else if (x >= 0 && x < 30000){
//            System.out.println("The variable x is positive");
//        } else {
//            System.out.println("The variable x is approaching " + Short.MAX_VALUE);
//        }
//        System.out.println("This will run regardless of the value of x");

//        String customerChoice;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What flavor ice cream do you want?");
//        customerChoice = scanner.nextLine();
//        System.out.printf("%s%n", customerChoice);

        // Old school switch statement
//        switch (customerChoice) {
//            case "vanilla":
//                System.out.println("One vanilla coming right up");
//                break;
//            case "chocolate":
//                System.out.println("One chocolate coming right up");
//                break;
//            case "strawberry":
//                System.out.println("One strawberry coming right up");
//                break;
//            default:
//                System.out.println("Sorry, we don't have that flavor");
//                break;
//        }

        // enhanced switch statement
//        switch (customerChoice) {
//            case "vanilla" -> System.out.println("One vanilla coming right up");
//            case "chocolate" -> System.out.println("One chocolate coming right up");
//            case "strawberry" -> System.out.println("One strawberry coming right up");
//            default -> System.out.println("Sorry, we don't have that flavor");
//        }

//        String existence = "I exist";
        // Can't do this in Java:
//        if (existence) {
//            System.out.println("How can you be sure?");
//        }

        // Short-circuit operator:
        // If using `&&` operator, the evaluation short-circuits when
        // the first condition is false
//        int c = 0, d = 100, e = 50;
//        if ( c == 1 && e++ < 100){
//            d = 150;
//        }
//        System.out.println("d = " + d);
//        System.out.println("e = " + e);

        // Non-short-circuit operator
        // When using the `&`, the evaluation process does not short circuit
        // All conditions are evaluated
//        int c = 0, d = 100, e = 50;
//        if ( c == 1 && e++ < 100){
//            d = 150;
//        }
//        System.out.println("d = " + d);
//        System.out.println("e = " + e);

        int number = 42;
        boolean existence = true;

        // Short circuit logical OR operator
        // `||` This will short circuit if the first condition is true
//        if (existence || number++ == 42){}
//        System.out.println(number);

        // Non short circuit logical OR operator
        // `|` will continue evaluating conditions even if the first condition is true
//        if (existence | number++ == 42){}
//        System.out.println(number);

        // set the loop control variable
//        int i = 0;
//        // check the value of the loop control variable
//        while (i < 10) {
//            System.out.println("This is inside the loop. Before i is incremented though. The value of i is " + i);
//            // modify the loop control variable
//            i = i + 1;
//            System.out.println("This is still inside the loop, but now the loop control variable has incremented. The value of i is now " + i);
//        }

        // set the loop control variable
//        int i = 0;
//        do {
//            System.out.println("This is inside the loop. Before i is incremented though. The value of i is " + i);
//            // modify the loop control variable
//            i = i + 1;
//            System.out.println("This is still inside the loop, but now the loop control variable has incremented. The value of i is now " + i);
//        } while (i < 10);

        int i;
        for (i = 0; i < 10; i++){
            System.out.println("I'm in the loop. I has not incremented yet though. I is " + i);
        }
        System.out.println("This is now outside the loop. Notice i has incremented once more. I is " + i);


    }
}


