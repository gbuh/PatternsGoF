package creational.FactoryMethod.PizzaStyle;

public class VitCheesePizza implements Pizza {

    @Override
    public void createPizza() {
        System.out.println("Create Vitebsk style cheese pizza");
    }
}
