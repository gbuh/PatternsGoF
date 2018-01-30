package creational.AbstractFactory.pepsi;

import creational.AbstractFactory.Developer;

public class PepsiBolttle implements Developer{

    @Override
    public void writeCode() {
        System.out.println("Create pepsi bottle");
    }
}
