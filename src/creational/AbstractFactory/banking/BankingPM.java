package creational.AbstractFactory.banking;

import creational.AbstractFactory.ProjectManager;

public class BankingPM implements ProjectManager{

    @Override
    public void manageProject() {
        System.out.println("Banking PM manage banking project");
    }
}
