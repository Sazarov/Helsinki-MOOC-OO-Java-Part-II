import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Player implements Comparable<Player> {
    private ArrayList<Integer> jumpLengths = new ArrayList<Integer>();
    private Random random = new Random();
    private int points;
    private static final int NUMBER_OF_VOTES = 5;
    private String name;
    private int currentLength;
    private ArrayList<Integer> currentVoteResults;

    public Player(String name) {
        this.name = name;
    }

    public void jump() {
        currentLength = generateJumpLength();
        currentVoteResults = generateVoteResults();

        jumpLengths.add(currentLength);
        points += calculateResult(currentVoteResults, currentLength);
    }

    public int getCurrentLength() {
        return currentLength;
    }

    public ArrayList<Integer> getCurrentVoteResults() {
        return currentVoteResults;
    }

    public ArrayList<Integer> getJumpLengths() {
        return jumpLengths;
    }


    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int calculateResult(ArrayList<Integer> votes, int length) {
        ArrayList<Integer> local = (ArrayList<Integer>) votes.clone();

        local.remove(Collections.max(local));
        local.remove(Collections.min(local));

        int sum = 0;
        for (Integer vote :
                local) {
            sum += vote;
        }

        return sum + length;
    }

    private int generateJumpLength() {
        return random.nextInt(60) + 60;
    }

    private ArrayList<Integer> generateVoteResults() {
        ArrayList<Integer> votes = new ArrayList<Integer>();

        for (int i = 0; i < NUMBER_OF_VOTES; i++) {
            votes.add(random.nextInt(10) + 10);
        }
        return votes;
    }

    public String toString() {
        return name + " (" + points + " points)";
    }

    @Override
    public int compareTo(Player o) {
        return o.points - this.points;
    }
}
