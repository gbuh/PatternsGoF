package creational.AbstractFactory.banking;

import creational.AbstractFactory.Developer;
import creational.AbstractFactory.ProjectManager;
import creational.AbstractFactory.ProjectTeamFactory;
import creational.AbstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory{

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
