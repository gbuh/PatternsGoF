package creational.FactoryMethod.PizzaStyle;

public class MinPizzaFactory implements FactoryMethod {

    @Override
    public Pizza preparePizza(String name) {
        switch (name) {
        case "cheese":
            return new MinCheesePizza();
        case "veggie":
            return new MinVeggiPizza();
        default:
            return null;
        }
    }
}
