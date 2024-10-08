package Assignment3.Memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor("Memento mori");
        Caretaker caretaker = new Caretaker();

        caretaker.addMemento(editor.saveState());

        editor.setText("axax");
        editor.printState();

        caretaker.addMemento(editor.saveState());

        editor.setText("axax2");
        editor.printState();

        editor.restoreState(caretaker.getMemento(0));
        editor.printState();

        editor.restoreState(caretaker.getMemento(1));
        editor.printState();
    }
}
