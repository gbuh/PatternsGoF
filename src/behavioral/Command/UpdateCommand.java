package behavioral.Command;

public class UpdateCommand implements Command {
    DatabaseReceiver database;

    public UpdateCommand(DatabaseReceiver database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
