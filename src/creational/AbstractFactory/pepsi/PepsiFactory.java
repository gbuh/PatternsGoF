package creational.AbstractFactory.pepsi;

import creational.AbstractFactory.Developer;
import creational.AbstractFactory.ProjectManager;
import creational.AbstractFactory.ProjectTeamFactory;
import creational.AbstractFactory.Tester;

public class PepsiFactory implements ProjectTeamFactory{

    @Override
    public Developer getDeveloper() {
        return new PepsiBolttle();
    }

    @Override
    public Tester getTester() {
        return new PepsiLabel();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new PepsiCap();
    }
}
