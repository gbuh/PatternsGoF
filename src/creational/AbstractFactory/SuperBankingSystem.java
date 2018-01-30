package creational.AbstractFactory;

import creational.AbstractFactory.banking.BankingTeamFactory;

public class SuperBankingSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating super banking system...");

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
