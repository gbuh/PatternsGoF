package structural.Command;

public class ReadCommand implements Command {
    DatabaseReceiver database;

    public ReadCommand(DatabaseReceiver database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.read();
    }
}

