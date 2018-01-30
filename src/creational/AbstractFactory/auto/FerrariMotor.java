package creational.AbstractFactory.auto;

public class FerrariMotor implements Motor{

    @Override
    public void createMotor() {
        System.out.println("Create ferrari motor");
    }
}
