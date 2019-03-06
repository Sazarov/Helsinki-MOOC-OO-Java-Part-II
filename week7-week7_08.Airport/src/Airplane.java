import java.util.HashMap;
import java.util.Scanner;

public class Airplane {
    private Scanner reader;
    private HashMap<String, Integer> airplanes;

    public Airplane(Scanner reader) {
        this.reader=reader;
        this.airplanes = new HashMap<String, Integer>();
    }

    public boolean planeExists(String id) {
        return this.airplanes.containsKey(id);
    }

    public String getAirplaneDetails(String id) {
        if(planeExists(id)) {
            return id+ " (" + this.airplanes.get(id) +" ppl)";
        }
        return null;
    }

    public void addAirplane() {
        String id = readAirplaneID();

        System.out.println("Give plane capacity: ");

        String planeCapacityString = this.reader.nextLine();
        Integer planeCapacity = Integer.parseInt(planeCapacityString);

        this.airplanes.put(id, planeCapacity);
    }

    public void printAllAirplanes() {
        for (String plane :
                this.airplanes.keySet()) {
            System.out.println(getAirplaneDetails(plane));
        }
    }

    public void printAirplaneInfo() {
        String id = readAirplaneID();
        if(planeExists(id)) {
            System.out.println(getAirplaneDetails(id));
        }
    }

    public String readAirplaneID() {
        System.out.println("Give plane ID: ");
        return this.reader.nextLine();
    }
}
