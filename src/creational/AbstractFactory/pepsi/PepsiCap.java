package creational.AbstractFactory.pepsi;

import creational.AbstractFactory.ProjectManager;

public class PepsiCap implements ProjectManager{

    @Override
    public void manageProject() {
        System.out.println("Create pepsi cap");
    }
}
