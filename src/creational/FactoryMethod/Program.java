package creational.FactoryMethod;

public class Program {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = CreateDeveloperFactoryBySpecialty("php");
//        DeveloperFactory developerFactory = new JavaDeveloperFactory();
//        DeveloperFactory developerFactory = new CppDeveloperFactory();
//        DeveloperFactory developerFactory = new PhpDeveloperFactory();
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory CreateDeveloperFactoryBySpecialty(String specialty) {
        if(specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if(specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if(specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " - is unknown specialty!!!");
        }
    }
}
