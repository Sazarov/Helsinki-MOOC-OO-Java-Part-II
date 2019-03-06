import java.util.HashMap;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> cars;

    public VehicleRegister(){
        cars = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!cars.containsKey(plate) ) {
            cars.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        return cars.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if(cars.containsKey(plate)) {
            cars.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate :
                cars.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        String alreadyPrinted = "";
        for (String owner :
                cars.values()) {
            if (!alreadyPrinted.contains(owner)) {
                System.out.println(owner);
                alreadyPrinted += owner;
            }
        }
    }
}
