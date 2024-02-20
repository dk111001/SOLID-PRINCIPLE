package decorator;

public class VegClassic implements BasePizza{
    private int cost = 200;
    private final BasePizza basePizza;
    public VegClassic(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    public int calculateCost() {
        return cost + basePizza.calculateCost();
    }
}
