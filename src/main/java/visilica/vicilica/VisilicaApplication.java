package visilica.vicilica;

import java.util.Scanner;

public class VisilicaApplication {

    public static void main(String[] args) {

        System.out.println("Вас приветствует игра 'Висилица', суть игры отгадать слово c 7 попыток");
        while (true) {
            System.out.println("       Начать новую игру-нажмите 1");
            System.out.println("       Выход-нажмите 2");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();

            if (a == 1) {
                System.out.println("Игра началась");
                Game game = new Game();
                game.startGameLoop();
            }
            if (a == 2) {
                System.out.println("Вы вышли");
                break;
            }
        }
    }
}

