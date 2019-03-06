package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    private int maximumCapacity;
    private List<Item> box = new ArrayList<Item>();

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public boolean addThing(Thing thing) {
        if ((thing.getVolume() + getVolume()) <= maximumCapacity) {
            box.add((Item) thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int volume = 0;
        for (Item item :
                box) {
            volume += item.getVolume();
        }
        return volume;
    }

    @Override
    public String toString() {
        return "Things in the box: " + getVolume() + " dm^3";
    }
}
