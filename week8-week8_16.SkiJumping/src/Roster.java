import java.util.ArrayList;
import java.util.Collections;

public class Roster {
    private ArrayList<Player> roster;

    public Roster() {
        roster = new ArrayList<Player>();
    }

    public void add(String playerName) {
        Player player = new Player(playerName);
        roster.add(player);
    }

    public int size() {
        return roster.size();
    }

    public Player get(int index) {
        return roster.get(index);
    }

    public void sortAndReverse() {
        Collections.sort(roster, new SortAndReverse());
    }

    public void sort() {
        Collections.sort(roster);
    }

    public ArrayList<Player> getList() {
        return roster;
    }
}
