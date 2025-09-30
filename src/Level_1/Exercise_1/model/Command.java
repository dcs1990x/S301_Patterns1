package Level_1.Exercise_1.model;

public interface Command {
    String getCommandName();
    void execute();
    void undo();
}