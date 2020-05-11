package creational.Builder.builder;

public class PepperoniPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildDough() {
        pizza.setDough("PepperoniDough");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("PepperoniSauce");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("PepperoniTopping");
    }
}
