package creational.AbstractFactory.auto;

public class FerrariChassis implements Chassis{

    @Override
    public void createChassis() {
        System.out.println("Create ferrari chassis");
    }
}
