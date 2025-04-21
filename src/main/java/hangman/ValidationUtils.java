package hangman;

import java.util.*;

public class ValidationUtils {

    public Map<Integer, Character> indexLettersInWord(char letter, String word) {
        Map<Integer, Character> indexLeters = new HashMap<>();
        int indexLeter = word.indexOf(letter);
        char[] arrayWord = word.toCharArray();

        if (indexLeter >= 0) {
            for (int i = 0; i < arrayWord.length; i++) {
                if (arrayWord[i] == letter) {
                    indexLeters.put(i, letter);
                }
            }
        }
        return indexLeters;
    }

    public Boolean isNull(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '\u0000') {
                return false;
            }
        }
        return true;
    }
}
