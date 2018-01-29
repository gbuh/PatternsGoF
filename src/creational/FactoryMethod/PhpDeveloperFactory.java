package creational.FactoryMethod;

public class PhpDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
