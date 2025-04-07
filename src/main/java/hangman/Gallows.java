package hangman;

public class Gallows {

    public static void showVisilica(int numberErrors) {

        if (numberErrors==0){
            System.out.println("|----");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        if (numberErrors==1){
            System.out.println("|----");
            System.out.println("|   |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        if (numberErrors==2){
            System.out.println("|----");
            System.out.println("|   |");
            System.out.println("|   o");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        if (numberErrors==3){
            System.out.println("|----");
            System.out.println("|   |");
            System.out.println("|   o");
            System.out.println("|   O");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        if (numberErrors==4){
            System.out.println("|----");
            System.out.println("|   |");
            System.out.println("|   o");
            System.out.println("|  /O");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        if (numberErrors==5){
            System.out.println("|----");
            System.out.println("|   |");
            System.out.println("|   o");
            System.out.println("|  /O\\");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        if (numberErrors==6){
            System.out.println("|----");
            System.out.println("|   |");
            System.out.println("|   o");
            System.out.println("|  /O\\");
            System.out.println("|  /");
            System.out.println("|");
            System.out.println("|");
        }
        if (numberErrors==7){
            System.out.println("|----");
            System.out.println("|   |");
            System.out.println("|   O");
            System.out.println("|  /O\\");
            System.out.println("|  / \\");
            System.out.println("|");
            System.out.println("|");
        }
    }
}
