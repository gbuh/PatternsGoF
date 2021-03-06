package creational.FactoryMethod.PizzaStyle;

public class VitPizzaFactory implements FactoryMethod {

    @Override
    public Pizza preparePizza(String name) {
        switch (name) {
        case "cheese":
            return new VitCheesePizza();
        case "veggie":
            return new VitVeggiPizza();
        default:
            return null;
        }
    }
}
