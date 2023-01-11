package fabricMethod.fabric;

import fabricMethod.products.Transport;

public abstract class Travel {
    //Бизнес-логика
    public void testTransport() {
        Transport transport = createTransport();
        System.out.println(transport.transportName() +"\t" +  transport.signal());
    }

    //Фабричный метод
    public abstract Transport createTransport();
}
