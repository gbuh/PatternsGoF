package structural.Facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }
    
    public void startingSprint() {
        System.out.println("Sprint is active...");
        activeSprint = true;
    }
    
    public void finishSprint() {
        System.out.println("Sprint is not active...");
        activeSprint = false;
    }
}
