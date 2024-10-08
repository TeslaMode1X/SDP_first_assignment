package Assignment3.Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    List<TextMemento> saves = new ArrayList<>();
    public void addMemento(TextMemento text) {
        saves.add(text);
    }
    public TextMemento getMemento(int index) {
        return saves.get(index);
    }
}
