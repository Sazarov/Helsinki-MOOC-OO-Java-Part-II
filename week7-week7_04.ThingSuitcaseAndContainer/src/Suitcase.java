import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> things = new ArrayList<Thing>();

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        if (!(totalWeight()+thing.getWeight() > this.maxWeight)) {
            this.things.add(thing);
        }
    }

    public int totalWeight() {
        int currentWeight = 0;
        for (Thing thingy :
                this.things) {
            currentWeight += thingy.getWeight();
        }
        return currentWeight;
    }

    public String toString() {
        if (this.things.isEmpty()) {
            return "empty " + "(" + totalWeight() + " kg)";
        } else if (this.things.size() == 1) {
            return this.things.size() + " thing" + "(" + totalWeight() + " kg)";
        } else {
            return this.things.size() + " things" + "(" + totalWeight() + " kg)";
        }
    }

    public void printThings() {
        for (Thing thingy :
                this.things) {
            System.out.println(thingy.toString());
        }
    }
    
    public Thing heaviestThing() {
        if (this.things.isEmpty()) {
            return null;
        } else {
            Thing heaviestThing = this.things.get(0);
            for (Thing thing :
                    this.things) {
                if (thing.getWeight() > heaviestThing.getWeight()) {
                    heaviestThing = thing;
                }
            }
            return heaviestThing;
        }
    }
    
}
