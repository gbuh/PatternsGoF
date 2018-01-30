package creational.AbstractFactory.website;

import creational.AbstractFactory.Developer;

public class PhpDeveloper implements Developer{

    @Override
    public void writeCode() {
        System.out.println("Php developer write website code");
    }
}
