package creational.FactoryMethod;

public class PepsiBottleFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new PepsiBottle();
    }
}
