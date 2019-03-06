package application;

import java.util.Random;

public class Thermometer implements Sensor {
    private boolean active;
    private Random random = new Random();

    @Override
    public boolean isOn() {
        return active;
    }

    @Override
    public void on() {
        active = true;
    }

    @Override
    public void off() {
        active = false;
    }

    @Override
    public int measure() {
        if (isOn()) {
            return random.nextInt(60) - 30;
        }

        throw new IllegalArgumentException();
    }
}
