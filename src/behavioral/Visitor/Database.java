package behavioral.Visitor;

public class Database implements ProjectElement {

    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
