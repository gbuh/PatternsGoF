package creational.AbstractFactory.website;

import creational.AbstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager{

    @Override
    public void manageProject() {
        System.out.println("Website PM manage website project");
    }
}
