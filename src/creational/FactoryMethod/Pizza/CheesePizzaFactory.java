package creational.FactoryMethod.Pizza;

public class CheesePizzaFactory implements FactoryMethod {

    @Override
    public Pizza preparePizza() {
        return new CheesePizza();
    }
}
