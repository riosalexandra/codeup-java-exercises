import util.Input;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        String userInput = input.getString();
        System.out.println(userInput);

        int userInput2 = input.getInt(10, 50);
        System.out.println(userInput2);


    }
}
