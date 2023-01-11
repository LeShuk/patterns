package fabricMethod.fabric;

import fabricMethod.products.Ship;
import fabricMethod.products.Transport;

public class ShipTravel extends Travel {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
