package creational.FactoryMethod;

public class ColaBottleFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new ColaBottle();
    }
}
