package fabricMethod.products;

public class Car implements Transport{
    @Override
    public String transportName() {
        return "I am Car!";
    }

    @Override
    public String signal() {
        return "Bep-bep";
    }
}
