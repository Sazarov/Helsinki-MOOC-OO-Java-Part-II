import java.util.Comparator;

public class SortAndReverse implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return o1.getPoints() - o2.getPoints();
    }
}
