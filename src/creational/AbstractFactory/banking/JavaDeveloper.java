package creational.AbstractFactory.banking;

import creational.AbstractFactory.Developer;

public class JavaDeveloper implements Developer{

    @Override
    public void writeCode() {
        System.out.println("Java developer write banking code");
    }
}
