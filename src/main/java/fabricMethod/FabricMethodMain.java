package fabricMethod;

import fabricMethod.fabric.BusTravel;
import fabricMethod.fabric.CarTravel;
import fabricMethod.fabric.ShipTravel;
import fabricMethod.fabric.Travel;

public class FabricMethodMain {
    private static Travel travel;

    public static void main(String[] args) {
        configure("Bus");
        runTravelLogic();

        configure("Ship");
        runTravelLogic();

        configure("Airplane");
        runTravelLogic();
    }
    static void configure(String travelType) {
        FabricMethodMain.travel = switch (travelType) {
            case "Bus" -> new BusTravel();
            case "Ship" -> new ShipTravel();
            default -> new CarTravel();
        };
    }
    static void runTravelLogic() {
        travel.testTransport();
    }
}
