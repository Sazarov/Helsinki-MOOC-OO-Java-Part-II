package containers;

import java.util.ArrayList;
import java.util.List;

public class ContainerHistory {
	private List<Double> history;
	
	public ContainerHistory() {
		history = new ArrayList<Double>();
	}
	
	public void add(double situation) {
		history.add(situation);
	}
	
	public void reset() {
		history.clear();
	}
	
	public String toString() {
		return history.toString();
	}
	
	public double maxValue() {
		double max = 0d;
		if (history.isEmpty()) {
			return max;
		}
		
		for (double situation :
				history) {
			if (situation > max) {
				max = situation;
			}
		}
		
		return max;
	}
	
	public double minValue() {
		double min = 0d;
		if (history.isEmpty()) {
			return min;
		}
		
		min = history.get(0);
		
		for (double situation :
				history) {
			if (situation < min) {
				min = situation;
			}
		}
		
		return min;
	}
	
	public double average() {
		double average = 0d;
		double sum = 0d;
		
		if (history.isEmpty()) {
			return average;
		}
		
		for (double situation:
		     history) {
			sum += situation;
		}
		
		return sum/history.size();
	}
	
	public double greatestFluctuation() {
		double difference = 0;
		if (history.isEmpty() || history.size() == 1) {
			return 0;
		}
		
		for (int i = 0; i < history.size() - 1; i++) {
			double curr = (history.get(i));
			double next = (history.get(i+1));
			double absDifference = Math.max(curr, next) - Math.min(curr, next);
			
			if(absDifference > difference) {
				difference = absDifference;
			}
		}
		
		return difference;
	}
	
	public double variance() {
		double sumOfSquares = 0d;
		double average = average();
		
		for (double entry :
				history) {
			sumOfSquares += Math.pow((entry - average), 2);
		}
		
		return sumOfSquares/(history.size() -1);
	}
}
