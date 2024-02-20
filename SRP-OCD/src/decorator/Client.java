package decorator;

public class Client {
    public static void main(String[] args) {
        BasePizza basePizza = new ExtraCheese(new VegClassic(new PlainPizza()));
        System.out.println(basePizza.calculateCost());
    }
}
