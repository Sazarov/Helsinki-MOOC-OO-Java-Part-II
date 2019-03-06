package farmsimulator;

import java.util.Collection;

public class Barn {
	private BulkTank bulkTank;
	private MilkingRobot milkingRobot;
	
	public Barn(BulkTank tank) {
		bulkTank = tank;
	}
	
	public BulkTank getBulkTank() {
		return bulkTank;
	}
	
	public void installMilkingRobot(MilkingRobot milkingRobot) {
		this.milkingRobot = milkingRobot;
		this.milkingRobot.setBulkTank(bulkTank);
	}
	
	public void takeCareOf(Cow cow) throws IllegalStateException {
		if(milkingRobot == null) {
			throw new IllegalStateException();
		}
		
		milkingRobot.milk(cow);
	}
	
	public void takeCareOf(Collection<Cow> cows) throws IllegalStateException {
		if(milkingRobot == null) {
			throw new IllegalStateException();
		}
		
		for (Milkable cow :
				cows) {
			milkingRobot.milk(cow);
		}
	}
	
	public String toString() {
		return bulkTank.toString();
	}
}
