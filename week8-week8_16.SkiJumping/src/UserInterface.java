import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private Roster roster;
    private int round;

    public UserInterface(Scanner reader) {
        this.reader = reader;
        roster = new Roster();
        round = 1;
    }

    public void play() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");

        playerSelectionPhase();
        jumpPhase();
    }

    private void playerSelectionPhase() {
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while (true) {
            System.out.println("  Participant name: ");
            String playerName = reader.nextLine();

            if (playerName.isEmpty()) {
                break;
            } else {
                roster.add(playerName);
            }
        }
    }

    private void jumpPhase() {
        System.out.println("The tournament begins!");
        System.out.println("");

        while (true) {
            System.out.println("Write \"jump\" to jump; otherwise you quit:");
            String command = reader.nextLine();

            if (!command.equals("jump")) {
                break;
            } else {
                jump();
            }
        }

        printResults();
    }

    private void jump() {
        System.out.println("Round " + round);
        System.out.println("Jumping order: ");
        for (int i = 1; i < roster.size() + 1; i++) {
            Player player = roster.get(i - 1);
            System.out.println("  " + i + ". " + player);
            player.jump();
        }

        System.out.println("Results of round " + round++);

        for (Player player :
                roster.getList()) {
            System.out.println("  " + player.getName());
            System.out.println("    length: " + player.getCurrentLength());
            System.out.println("    judge votes: " + player.getCurrentVoteResults());
        }

        roster.sortAndReverse();
    }

    private void printResults() {
        System.out.println("Thanks!");
        System.out.println("");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");

        roster.sort();

        for (int i = 1; i < roster.size() + 1; i++) {
            Player player = roster.get(i - 1);
            System.out.println(i + "           " + player);
            System.out.print("            jump lengths: ");

            for (int j = 0; j < player.getJumpLengths().size(); j++) {
                int jumpLength = player.getJumpLengths().get(j);
                String prefix = (j == 0) ? "" : ", ";
                System.out.print(prefix + jumpLength + " m");
            }
            System.out.println("");
        }
    }
}
