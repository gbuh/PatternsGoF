package creational.FactoryMethod.Pizza;

public class VeggiPizza implements Pizza {

    @Override
    public void createPizza() {
        System.out.println("Create vegetable pizza");
    }
}
