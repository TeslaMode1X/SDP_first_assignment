package Assignment3.Memento;

public class TextEditor {
    private String text;
    public TextEditor(String text) {
        this.text = text;
    }

    public TextMemento saveState() {
        return new TextMemento(text);
    }

    public void restoreState(TextMemento memento) {
        this.text = memento.getText();
    }

    public void setText(String text) {
        this.text = text;
    }

    public void printState() {
        System.out.println("Text: " + text);
    }
}
