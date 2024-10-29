package Memento;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history; // Memento history
    private List<IMemento> redoHistory; // Memento's removed from history

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.redoHistory = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
        clearRedoHistory();
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
        clearRedoHistory();
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Memento found in history");

            IMemento currentState = model.createMemento();
            redoHistory.add(currentState);

            IMemento previousState = history.remove(history.size() - 1);
            restoreState(previousState);
        }
    }

    public void redo() {
        if (!redoHistory.isEmpty()) {
            System.out.println("Memento found in redo history");

            IMemento currentState = model.createMemento();
            history.add(currentState);

            IMemento redoState = redoHistory.remove(redoHistory.size() - 1);
            restoreState(redoState);
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
    }

    private void clearRedoHistory() {
        redoHistory.clear();
    }

    public List<IMemento> getHistory() {
        return history;
    }

    public void restoreState(IMemento memento) {
        model.restoreState(memento);
        gui.updateGui(); // Update GUI after restoring state
    }
}