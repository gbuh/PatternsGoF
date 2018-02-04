package creational.FactoryMethod.PizzaStyle;

public class MinCheesePizza implements Pizza {

    @Override
    public void createPizza() {
        System.out.println("Create Minsk style cheese pizza");
    }
}
