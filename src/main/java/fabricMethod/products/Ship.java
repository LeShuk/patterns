package fabricMethod.products;

public class Ship implements Transport{
    @Override
    public String transportName() {
        return "Ship...";
    }

    @Override
    public String signal() {
        return "Uuuuuuiiiiiii!";
    }
}
