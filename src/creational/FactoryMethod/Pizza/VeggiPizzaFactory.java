package creational.FactoryMethod.Pizza;

public class VeggiPizzaFactory implements FactoryMethod {

    @Override
    public Pizza preparePizza() {
        return new VeggiPizza();
    }
}
