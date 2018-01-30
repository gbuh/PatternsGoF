package creational.AbstractFactory;

import creational.AbstractFactory.website.WebsiteTeamFactory;

public class SuperwebsiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating super website project...");

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
