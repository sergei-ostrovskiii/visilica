package visilica.vicilica;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

    // получить коллекцию слов из файла
    public static ArrayList<String> getCollectionWordsFromFile() {
        ArrayList<String> collekcia = new ArrayList<>();

        try {
            FileReader fr = new FileReader("src/main/resources/slovar.txt");
            Scanner sc = new Scanner(fr);

            while (sc.hasNextLine()) {
                String st = sc.nextLine();
                collekcia.add(st);
            }
            return collekcia;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return collekcia;
    }

    // получить рэндомное слово
    public static String getRandomWord(ArrayList<String> collekcia){
        int l = (int) (Math.random() * collekcia.size()) + 1;
        String stroka = collekcia.get(l);
        String slovo = stroka.toLowerCase();
        return slovo;
    }
}
