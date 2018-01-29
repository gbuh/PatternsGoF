package creational.FactoryMethod;

public class CppDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
