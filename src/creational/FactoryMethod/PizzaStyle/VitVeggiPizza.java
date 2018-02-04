package creational.FactoryMethod.PizzaStyle;

public class VitVeggiPizza implements Pizza {

    @Override
    public void createPizza() {
        System.out.println("Create Vitebsk style veggie pizza");
    }
}
