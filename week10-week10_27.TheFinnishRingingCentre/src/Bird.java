
public class Bird {
	
	private String name;
	private String latinName;
	private int ringingYear;
	
	public Bird(String name, String latinName, int ringingYear) {
		this.name = name;
		this.latinName = latinName;
		this.ringingYear = ringingYear;
	}
	
	
	@Override
	public String toString() {
		return this.latinName + " (" + this.ringingYear + ")";
	}
	
	public boolean equals(Object otherBird) {
		Bird compareBird = (Bird)otherBird;
		if (this.latinName.equals(compareBird.latinName) && this.ringingYear == compareBird.ringingYear) {
			return true;
		}
		return false;
	}
	
	public int hashCode() {
		return this.ringingYear;
	}
}


