import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        String input = "kur\n" + "pendel\n" +"\n" + "jump\n" + "jump\n" + "\n";
        Scanner reader = new Scanner(System.in);
        UserInterface game = new UserInterface(reader);

        game.play();
    }
}
