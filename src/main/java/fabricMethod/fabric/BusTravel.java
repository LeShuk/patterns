package fabricMethod.fabric;

import fabricMethod.products.Bus;
import fabricMethod.products.Transport;

public class BusTravel extends Travel {
    @Override
    public Transport createTransport() {
        return new Bus();
    }
}
