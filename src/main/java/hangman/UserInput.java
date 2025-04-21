package hangman;

import java.util.Scanner;

public class UserInput {

    private Scanner scanner = new Scanner(System.in);

    public char userInput() {
        while (true) {
            String input = scanner.nextLine().toLowerCase();

            if (input.isEmpty()) {
                System.out.println("Вы ввели пустую строку");

            } else {
                return input.charAt(0);
            }
        }
    }
}
