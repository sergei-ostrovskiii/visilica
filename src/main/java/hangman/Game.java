package hangman;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Game {

    public int countErrors;

    public int MAX_NUNBER_ERROR = 7;

    char[] correctLetter;

    Set<Character> inputLetters = new HashSet<>();

    public String word;

    ValidationUtils validatorUtils = new ValidationUtils(this);

    public void play() {
        boolean isPlay = Menu.menu();

        while (isPlay) {
            startGameLoop();
            isPlay = Menu.menu();
        }
    }

    //игровой цикл
    public void startGameLoop() {
        this.word = WordRandomaizer.getRandomWord(FileManager.getCollectionWordsFromFile());
        // массив для правильных букв
        correctLetter = new char[word.length()];
        boolean maxCountError = true;

        while (maxCountError) {
            if (countErrors >= MAX_NUNBER_ERROR) {
                System.out.println("Вы проиграли");
                countErrors = 0;
                maxCountError = false;

            } else {
                WordMask wordMask = new WordMask();
                wordMask.printMaskWord(correctLetter);
                System.out.println(word);

                System.out.println("Введите букву");

                UserInput userInput = new UserInput();
                char input = userInput.userInput();

                Map<Integer, Character> indexLeters = validatorUtils.indexLettersInWord(input, word);

                if (inputLetters.contains(input)) {
                    System.out.println("Такая буква уже была введена");
                    continue;
                }
                if (!indexLeters.isEmpty()) {
                    correctLetter = wordMask.openLetersInWord(correctLetter, indexLeters);
                    inputLetters.add(input);
                    System.out.println("Правильная буква");
                }
                else {
                    System.out.println("Неверная буква");
                    countErrors++;
                    inputLetters.add(input);
                }
                System.out.println("Количество ошибок: " + countErrors);

                Gallows.showVisilica(countErrors);

                if (validatorUtils.isNull(correctLetter)) {
                    System.out.println("Вы победили");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println();
                    break;
                }
            }
        }
    }
}




