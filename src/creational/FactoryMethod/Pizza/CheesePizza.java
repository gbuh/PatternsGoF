package creational.FactoryMethod.Pizza;

public class CheesePizza implements Pizza {

    @Override
    public void createPizza() {
        System.out.println("Create cheese pizza");
    }
}
