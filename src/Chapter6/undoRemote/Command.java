package Chapter6.undoRemote;

public interface Command {
    public void execute();

    public void undo();
}
