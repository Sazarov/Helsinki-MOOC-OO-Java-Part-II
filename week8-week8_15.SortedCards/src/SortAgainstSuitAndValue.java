import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {
    public int compareSuit(Card card1, Card card2) {
        return card1.getSuit() - card2.getSuit();
    }

    @Override
    public int compare(Card card1, Card card2) {
        if (compareSuit(card1, card2) == 0) {
            return card1.getValue() - card2.getValue();
        } else {
            return compareSuit(card1, card2);
        }
    }
}
