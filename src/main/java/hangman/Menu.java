package hangman;

import java.util.Scanner;

public class Menu {

    public static boolean menu() {
        System.out.println("Вас приветствует игра 'Висилица', суть игры отгадать слово c 7 попыток");

        while (true) {
            System.out.println("       Начать новую игру-нажмите 1");
            System.out.println("       Выход-нажмите 2");
            Scanner scanner = new Scanner(System.in);
            int input = 0;

            try {
                input = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Введите цифру");
            }

            if (input == 1) {
                System.out.println("Игра началась");
                return true;
            }

            if (input == 2) {
                System.out.println("Вы вышли");
                return false;
            } else {
                System.out.println("Неверный ввод!");
            }
        }
    }
}