package hangman;

import java.util.*;

public class ValidationUtils {

    // введенные символы
    private Set<Character> enteredLetters = new HashSet<>();

    private Scanner scanner = new Scanner(System.in);

    Game game;

    ValidationUtils(Game game) {
        this.game = game;
    }

    public String userInput() {
        return scanner.nextLine();
    }

    public void volidate(char input) {

        if (enteredLetters.contains(input)) {
            System.out.println("Буква уже была введенна");
        } else {
          // checkLetterInWord(input);
            enteredLetters.add(input);
        }
    }

//    public void checkLetterInWord(String letter) {
//        int index = game.word.indexOf(letter);
//
//        if (index >= 0) {
//            for (int i = 0; i < game.arrayWord.length; i++) {
//                if (game.arrayWord[i] == game.word.charAt(index) && game.correctLetter[i] != game.arrayWord[i]) {
//                    game.correctLetter[i] = game.arrayWord[i];
//                }
//                enteredLetters.add(letter);
//            }
//            System.out.println("Правильная буква");
//        } else {
//            enteredLetters.add(letter);
//            game.countErrors++;
//            System.out.println("Неправильная буква");
//        }
//    }

    public Map<Integer,Character> indexLettersInWord(char letter, String word) {
        Map<Integer,Character> indexLeters = new HashMap<>();
        int index = word.indexOf(letter);
        char[] arrayWord = word.toCharArray();

        if (index >= 0) {
            for (int i = 0; i < arrayWord.length; i++) {
                if (arrayWord[i] == letter) {
                    indexLeters.put(i, letter);
                }
            }
        }
        return indexLeters;
    }

        public Boolean isNull(char[] array){
            for (int i = 0; i < array.length; i++) {
                if (array[i] == '\u0000') {
                    return false;
                }
            }
            return true;
        }
}
