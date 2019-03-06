import java.util.ArrayList;
import java.util.List;

public class Box implements ToBeStored {
    private double maxWeight;
    private List<ToBeStored> box;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        box = new ArrayList<ToBeStored>();
    }

    @Override
    public double weight() {
        double weight = 0;
        for (ToBeStored item :
                box) {
            weight+= item.weight();
        }
        return weight;
    }

    public String toString() {
        return "Box: " + box.size() + " things, total weight " + weight() + " kg";
    }

    public void add(ToBeStored item) {
        if ((weight()+item.weight()) > maxWeight) {
            return;
        } else {
            box.add(item);
        }
    }

}
