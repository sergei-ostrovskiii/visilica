package hangman;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

    public static ArrayList<String> getCollectionWordsFromFile() {
        ArrayList<String> dictionary = new ArrayList<>();

        try {
            FileReader fr = new FileReader("src/main/resources/Dictionary.txt");
            Scanner scanner = new Scanner(fr);

            while (scanner.hasNextLine()) {
                String word = scanner.nextLine();
                dictionary.add(word);
            }
            return dictionary;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return dictionary;
    }
}
