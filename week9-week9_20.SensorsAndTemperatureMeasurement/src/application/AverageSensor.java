package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
	private List<Sensor> sensorList;

	private List<Integer> readings;
	
	public AverageSensor() {
		sensorList = new ArrayList<Sensor>();
		readings = new ArrayList<Integer>();
	}
	
	@Override
	public boolean isOn() {
		boolean isOn = true;
		for (Sensor sensor :
				sensorList) {
			if (!sensor.isOn()) {
				isOn = false;
			}
		}
		
		return isOn;
	}
	
	@Override
	public void on() {
		for (Sensor sensor :
				sensorList) {
			sensor.on();
		}
	}
	
	@Override
	public void off() {
		for (Sensor sensor :
				sensorList) {
			sensor.off();
		}
	}
	
	@Override
	public int measure() {
		if (sensorList.size() == 0) {
			throw new IllegalStateException();
		}
		int sumOfReadings = 0;
		
		for (Sensor sensor :
				sensorList) {
			sumOfReadings += sensor.measure();
		}
		
		int reading = sumOfReadings/sensorList.size();
		readings.add(reading);
		
		return reading;
	}
	
	public void addSensor(Sensor additional) {
		sensorList.add(additional);
	}
	
	public List<Integer> readings() {
		return readings;
	}
}
