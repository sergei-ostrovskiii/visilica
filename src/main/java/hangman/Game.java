package hangman;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Game {

    private int countErrors;
    public int MAX_NUNBER_ERROR = 7;

    char[] correctLetter;
    Set<Character> inputLetters = new HashSet<>();

    public String word;

    ValidationUtils validatorUtils = new ValidationUtils();

    public void play() {
        boolean isPlay = Menu.menu();

        while (isPlay) {
            startGameLoop();
            isPlay = Menu.menu();
        }
    }

    public void startGameLoop() {
        this.word = WordRandomaizer.getRandomWord(FileManager.getCollectionWordsFromFile());
        correctLetter = new char[word.length()];
        boolean maxCountError = true;

        while (maxCountError) {
            if (countErrors == MAX_NUNBER_ERROR) {
                System.out.println("Вы проиграли");
                countErrors = 0;
                maxCountError = false;

            } else {
                WordMask wordMask = new WordMask();
                System.out.println();
                wordMask.printMaskWord(correctLetter);

                System.out.println("Количество ошибок: " + countErrors);

                Gallows.showVisilica(countErrors);

                System.out.println("Введите букву");

                UserInput userInput = new UserInput();
                char input = userInput.userInput();

                Map<Integer, Character> indexLeters = validatorUtils.indexLettersInWord(input, word);

                if (inputLetters.contains(input)) {
                    System.out.println("Такая буква уже была введена");
                    continue;
                }

                if (!indexLeters.isEmpty()) {
                    System.out.println("Правильная буква");
                    correctLetter = wordMask.openLetersInWord(correctLetter, indexLeters);
                    inputLetters.add(input);
                }

                if (input == ' ') {
                    System.out.println("Вы ввели пробел");
                    continue;
                }

                if (input > 47 & input < 58) {
                    System.out.println("Вы ввели цифру");
                    continue;
                }

                if (input >= 'a' & input <= 'z') {
                    System.out.println("Вы ввели латинскую букву, введите на кирилице");
                    continue;

                } if (indexLeters.isEmpty()){
                    System.out.println("Неверная буква");
                    countErrors++;
                    inputLetters.add(input);
                }

                if (validatorUtils.isNull(correctLetter)) {
                    System.out.println("Вы победили" + "\ud83E\uDD29");
                    System.out.println();
                    System.out.println();
                    break;
                }
            }
        }
        inputLetters.clear();
        countErrors = 0;
    }
}




