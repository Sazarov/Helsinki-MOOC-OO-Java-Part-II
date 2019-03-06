import java.util.HashMap;
import java.util.Scanner;

public class Flights {
    private HashMap<String, String> flights;
    private Scanner reader;
    Airplane planes;

    public Flights(Scanner reader, Airplane planes) {
        this.reader = reader;
        this.planes = planes;
        this.flights = new HashMap<String, String>();
    }

    public void addFlight() {
        System.out.println("Give plane ID: ");
        String planeId = this.reader.nextLine();

        System.out.println("Give departure airport code: ");
        String fromDest = this.reader.nextLine();

        System.out.println("Give destination airport code: ");
        String toDest = this.reader.nextLine();

        if (this.planes.planeExists(planeId)) {
            this.flights.put(this.planes.getAirplaneDetails(planeId), createFlightIdentifier(fromDest, toDest));
        }
    }

    public String createFlightIdentifier(String from, String to) {
        return "(" + from + "-" + to + ")";
    }

    public void printAllFlights() {
        for (String planeId :
                this.flights.keySet()) {
            System.out.println(planeId + " " + this.flights.get(planeId));
        }
    }
}
