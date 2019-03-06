package farmsimulator;

public class MilkingRobot {
	private BulkTank bulkTank;
	
	public MilkingRobot() {
	}
	
	public BulkTank getBulkTank() {
		return bulkTank;
	}
	
	public void setBulkTank(BulkTank tank) {
		bulkTank = tank;
	}
	
	public void milk(Milkable milkable) throws IllegalStateException {
		if (bulkTank == null) {
			throw new IllegalStateException();
		}
		double milkExtracted = milkable.milk();
		bulkTank.addToTank(milkExtracted);
	}
}
