package fabricMethod.fabric;

import fabricMethod.products.Car;
import fabricMethod.products.Transport;

public class CarTravel extends Travel {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}
