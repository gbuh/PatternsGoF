package structural.Decorator.Starbuzz;

public class Sugar extends Decorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getName() {
        return coffee.getName() + ", sugar";
    }

    @Override
    public double cost() {
        double cost = 0.1 + coffee.cost();
        cost = Math.round(cost * 100) / 100.0d;
        return cost;
    }
}
