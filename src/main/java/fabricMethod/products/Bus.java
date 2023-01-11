package fabricMethod.products;

public class Bus implements Transport{
    @Override
    public String transportName() {
        return "I am Bus.";
    }

    @Override
    public String signal() {
        return "Beeep!!!";
    }
}
