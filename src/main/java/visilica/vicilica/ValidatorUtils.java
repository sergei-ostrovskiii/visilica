package visilica.vicilica;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ValidatorUtils {

    // введенные символы
    private Set<String> enteredLetters= new HashSet<>();

    private Scanner scanner = new Scanner(System.in);

    Game game;

    ValidatorUtils(Game game) {
        this.game = game;
    }

    public String userInput(){
     return scanner.nextLine();
    }

    public void volidate(String input){
        if (enteredLetters.contains(input)){
            System.out.println("Буква уже была введенна");
        }
        else {
            checkLetterInWord(input);
        }
    }

    public void checkLetterInWord(String letter) {
        int index = game.word.indexOf(letter);

        if (index >= 0) {
            for (int i = 0; i < game.arrayWord.length; i++) {
                if (game.arrayWord[i] == game.word.charAt(index) && game.correctLetter[i] != game.arrayWord[i]) {
                    game.correctLetter[i] = game.arrayWord[i];
                }
                enteredLetters.add(letter);
            }
            System.out.println("Правильная буква");
        }
        else {
            enteredLetters.add(letter);
            game.countErrors++;
            System.out.println("Неправильная буква");
        }
    }
}
