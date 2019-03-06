import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> container = new ArrayList<Suitcase>();

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (!(suitcase.totalWeight() + totalWeight() > this.maxWeight)) {
            this.container.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase sc :
                this.container) {
            totalWeight += sc.totalWeight();
        }
        return totalWeight;
    }

    public String toString() {
        return this.container.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    public void printThings() {
        for (Suitcase suitcase :
                this.container) {
            suitcase.printThings();
        }
    }
}
