package visilica.vicilica;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Game {

    public int countErrors;

    public String word = FileManager.getRandomWord(FileManager.getCollectionWordsFromFile());

    // массив для правильных букв
    char[] correctLetter = new char[word.length()];

    char[] arrayWord = word.toCharArray();

    ValidatorUtils validatorUtils = new ValidatorUtils(this);

    //игровой цикл
    public void startGameLoop() {
        Boolean maxCountError = true;
        while (maxCountError) {
            if (countErrors>= 7) {
                maxCountError = false;
            }else {
                showWord();
                System.out.println("Введите букву");
                String letter = validatorUtils.userInput();
                validatorUtils.volidate(letter);
                System.out.println("Количество ошибок: " + countErrors);
                Gallows.showVisilica(countErrors);
            }
        }
    }

    public void showWord() {
        for (char ch : correctLetter) {
            System.out.print(ch);
        }
        System.out.println();
    }
}




