import java.util.Scanner;

public class Panel {
    private Scanner reader;

    public Panel(Scanner reader) {
        this.reader = reader;
    }

    public void kur() {

    }
    public void run() {
        Airplane airplanes = new Airplane(this.reader);
        Flights flights = new Flights(this.reader, airplanes);

        System.out.println(
                "Airport panel");
        while (true) {
//            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            String command = this.reader.nextLine();
            if (command.equals("1")) {
                airplanes.addAirplane();
            } else if (command.equals("2")) {
                flights.addFlight();
                flights.printAllFlights();
            } else if (command.equals("x")) {
                break;
            }
        }

        System.out.println("Flight service");
        while (true) {
//            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            String command = this.reader.nextLine();

            if (command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                airplanes.printAllAirplanes();
            } else if (command.equals("2")) {
                flights.printAllFlights();
            } else if (command.equals("3")) {
                airplanes.printAirplaneInfo();
            }
        }
    }
}
