package hangman;

import java.util.Map;

public class WordMask {

    public void printMaskWord(char[] maskWord) {
        for (char ch : maskWord) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public char[] openLetersInWord(char[] correctLetter, Map<Integer, Character> indexLetters) {
        char[] wordCharArray;
        wordCharArray = correctLetter;

        for (Map.Entry<Integer, Character> entry : indexLetters.entrySet()) {
            wordCharArray[entry.getKey()] = entry.getValue();
        }

        return wordCharArray;

    }
}
