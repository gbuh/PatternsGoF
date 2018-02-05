package structural.Facade;

public class Developer {
    public void doJobBeforDeadline(BugTracker bugTracker) {
        if(bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problem...");
        } else {
            System.out.println("Developer read Habrahabr...");
        }
    }
}
