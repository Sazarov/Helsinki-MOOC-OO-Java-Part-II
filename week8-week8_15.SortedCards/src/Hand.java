import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand = new ArrayList<Card>();

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        for (Card card :
                hand) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(hand);
    }

    @Override
    public int compareTo(Hand o) {
        int thisHandValue =0;
        int otherHandValue = 0;

        for (Card card :
                hand) {
            thisHandValue += card.getValue();
        }

        for (Card card :
                o.hand) {
            otherHandValue += card.getValue();
        }

        if (otherHandValue < thisHandValue) {
            return 1;
        } else if ( otherHandValue > thisHandValue) {
            return -1;
        } else {
            return 0;
        }
    }

    public void sortAgainstSuit() {
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }
}
