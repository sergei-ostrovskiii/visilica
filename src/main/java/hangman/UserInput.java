package hangman;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner = new Scanner(System.in);

    public char userInput() {
        String input = scanner.nextLine();
        return input.charAt(0);
    }
}
