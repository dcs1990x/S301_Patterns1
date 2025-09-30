package Level_1.Exercise_1.model;

public interface CommandHistory {
    void addCommand(Command command);
    void undoCommand();
    void getCommandHistory();
}