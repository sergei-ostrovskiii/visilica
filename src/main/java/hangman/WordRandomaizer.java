package hangman;

import java.util.ArrayList;
import java.util.Random;

public class WordRandomaizer {

    public static String getRandomWord(ArrayList<String> dictionary){
        Random random = new Random();
        int l = random.nextInt(dictionary.size());

        return dictionary.get(l).toLowerCase();
    }
}
