package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int boxesVolume;
    private List<Box> boxList;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
        this.boxList = new ArrayList<Box>();
    }

    public List<Box> packThings(List<Thing> things) {
        Box box = new Box(boxesVolume);
        boxList.add(box);

        for (Thing item :
                things) {
            if (!box.addThing(item)) {
                box = new Box(boxesVolume);
                boxList.add(box);
                box.addThing(item);
            }
        }
        return boxList;
    }

}
