package decorator;

public class ExtraCheese implements BasePizza{
    int cost = 10;
    private final BasePizza basePizza;
    public ExtraCheese (BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    public int calculateCost() {
        return basePizza.calculateCost() + cost;
    }
}
