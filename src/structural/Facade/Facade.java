package structural.Facade;

public class Facade {
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();
    Developer developer = new Developer();

    public void solvingProblem() {
        job.doJob();
        bugTracker.startingSprint();
        developer.doJobBeforDeadline(bugTracker);
    }

    public void relaxTime() {
        bugTracker.finishSprint();
        developer.doJobBeforDeadline(bugTracker);
    }
}
