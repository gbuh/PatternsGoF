package structural.Bridge.Car;

public abstract class Make {
    Model model;

    public Make(Model model) {
        this.model = model;
    }

    abstract void showMake();
    
    void showDetales() {
        showMake();
        model.showModel();
    }
}
