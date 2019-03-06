package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {
	private int maxWeight;
	private List<Thing> box;
	
	public MaxWeightBox(int maxWeight) {
		this.maxWeight = maxWeight;
		box = new ArrayList<Thing>();
	}
	@Override
	public void add(Thing thing) {
		int nextWeight = thing.getWeight() + currentWeight();
		if(nextWeight <= maxWeight) {
			box.add(thing);
		}
	}
	
	@Override
	public boolean isInTheBox(Thing thing) {
		return box.contains(thing);
	}
	
	public int currentWeight() {
		int currWeight = 0;
		for (Thing thing :
				box) {
			currWeight += thing.getWeight();
		}
		
		return currWeight;
	}
}
