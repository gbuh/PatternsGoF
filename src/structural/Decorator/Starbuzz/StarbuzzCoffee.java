package structural.Decorator.Starbuzz;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Coffee coffee = new Sugar(new Milk(new DarkCoffee(Size.VENTI)));

//        System.out.println(coffee.getName() + ": " + coffee.cost() + " руб.");
        System.out.printf("%s: %.2f руб.", coffee.getName(), coffee.cost());
    }
}
