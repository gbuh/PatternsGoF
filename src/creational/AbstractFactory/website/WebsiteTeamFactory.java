package creational.AbstractFactory.website;

import creational.AbstractFactory.Developer;
import creational.AbstractFactory.ProjectManager;
import creational.AbstractFactory.ProjectTeamFactory;
import creational.AbstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory{

    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
