package structural.Decorator.Starbuzz;

public class DarkCoffee implements Coffee {
    Size size;

    public DarkCoffee(Size size) {
        this.size = size;
    }

    @Override
    public String getName() {
        return "Dark coffee " + size;
    }

    @Override
    public double cost() {
        return 1.0;
    }

    @Override
    public Size getSize() {
        return size;
    }
}
