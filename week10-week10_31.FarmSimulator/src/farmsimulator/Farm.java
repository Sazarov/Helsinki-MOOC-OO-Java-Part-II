package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive{
	private List<Cow> cows;
	private String owner;
	private Barn barn;
	
	public Farm(String owner, Barn barn) {
		cows = new ArrayList<Cow>();
		this.owner = owner;
		this.barn = barn;
	}
	@Override
	public void liveHour() {
		for (Cow cow :
				cows) {
			cow.liveHour();
		}
	}
	
	public void addCow(Cow cow) {
		cows.add(cow);
	}
	
	public String getOwner() {
		return owner;
	}
	
	public String toString() {
		String ownerStr = "Farm owner: " + owner + "\n";
		String barnStr = "Barn bulk tank: " + barn.getBulkTank() + "\n";
		String animalStr = "Animals: \n";
		
		for (Cow cow :
				cows) {
			animalStr += cow.toString() + "\n";
		}
		return ownerStr + barnStr + animalStr;
	}
	
	public void manageCows() {
		barn.takeCareOf(cows);
	}
	
	public void installMilkingRobot(MilkingRobot robot) {
		barn.installMilkingRobot(robot);
	}
}
