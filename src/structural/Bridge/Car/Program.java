package structural.Bridge.Car;

public class Program {
    public static void main(String[] args) {
        Make car = new BMW(new Sedan());
        Make car1 = new Honda(new Hatchback());
        
        car.showDetales();
        car1.showDetales();
    }
}
