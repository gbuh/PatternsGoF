package creational.FactoryMethod.PizzaStyle;

public class MinVeggiPizza implements Pizza {

    @Override
    public void createPizza() {
        System.out.println("Create Minsk style veggie pizza");
    }
}
