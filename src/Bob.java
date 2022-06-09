import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        // ends with ?
        if (userInput.endsWith("?")) {
            System.out.println("Sure");

        // ends with !
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");

        //  empty string
        } else if (userInput.trim().equals("")) {
            System.out.println("Fine, be that way.");

        // everything else
    } else {
            System.out.println("Whatever.");
        }

}}
