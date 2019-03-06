package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {
	private String name;
	private int udders = 15 + new Random().nextInt(26);
	private double milkVolume = 0;
	private static final String[] NAMES = new String[]{
			"Anu", "Arpa", "Essi", "Heluna", "Hely",
			"Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
			"Jaana", "Jami", "Jatta", "Laku", "Liekki",
			"Mainikki", "Mella", "Mimmi", "Naatti",
			"Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
			"Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
	
	
	public Cow() {
		name = NAMES[new Random().nextInt(NAMES.length-1)];
	}
	
	public Cow(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double getCapacity() {
		return udders;
	}
	
	public double getAmount() {
		return milkVolume;
	}
	
	@Override
	public void liveHour() {
		double milkToAdd = Math.ceil(0.7 + new Random().nextDouble() * 1.3);
		if(milkVolume + milkToAdd >= udders) {
			milkVolume = udders;
		} else {
			milkVolume += Math.ceil(0.7 + new Random().nextDouble() * 1.3);
		}
	}
	
	@Override
	public double milk() {
		double milkToBeReturned = milkVolume;
		milkVolume = 0;
		return milkToBeReturned;
	}
	
	public String toString() {
		return name + " " + milkVolume + "/" + udders;
	}
}
