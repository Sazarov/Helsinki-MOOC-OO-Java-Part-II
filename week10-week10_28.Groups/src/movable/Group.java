package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
	private List<Movable> group;
	
	public Group() {
		group = new ArrayList<Movable>();
	}
	
	public String toString() {
		String result = "";
		for (Movable object :
				group) {
			result += object.toString() + "\n";
		}
		
		return result;
	}
	
	public void addToGroup(Movable movable) {
		group.add(movable);
	}
	
	public void move(int dx, int dy) {
		for (Movable object :
				group) {
			object.move(dx, dy);
		}
	}
}
