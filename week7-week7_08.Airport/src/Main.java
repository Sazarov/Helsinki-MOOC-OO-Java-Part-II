import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);

//        String input = "1\n" + "kur\n" +
//                "52\n" + "2\n" +
//                "kur\n" + "LLL\n" + "MMM\n" + "x\n" +
//                "1\n" + "2\n" + "3\n" + "kur\n" + "x\n";
//        Scanner reader = new Scanner(input);

        Panel panel = new Panel(reader);

        panel.run();
    }
}
