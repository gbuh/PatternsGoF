package structural.Bridge.Car;

public class Honda extends Make {

    public Honda(Model model) {
        super(model);
    }

    @Override
    void showMake() {
        System.out.println("Honda");
    }
}
