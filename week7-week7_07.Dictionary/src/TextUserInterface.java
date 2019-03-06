import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        while(true) {
            String command = reader.nextLine();
            if (command.equals("quit")) {
                break;
            } else if (command.equals("add")) {
                add();
            } else if (command.equals("translate")) {
                translate();
            }

            else {
                System.out.println("Unknown statement");
            }
        }
    }

    public void add() {
        System.out.print("In Finnish: ");
        String finWord = this.reader.nextLine();

        System.out.print("Translation: ");
        String engWord = this.reader.nextLine();

        this.dictionary.add(finWord, engWord);
        System.out.println("");
    }

    public void translate() {
        System.out.print("Give a word: " );
        String inputWord = this.reader.nextLine();
        System.out.println("Translation: " + this.dictionary.translate(inputWord));
    }
}
