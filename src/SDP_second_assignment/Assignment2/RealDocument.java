package SDP_first_assignment.src.SDP_second_assignment.Assignment2;

import Assignment2.Document;

// Реальный документ, который требует загрузки
public class RealDocument implements Document {
    private String title;

    public RealDocument(String title) {
        this.title = title;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading " + title);
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public void display() {
        System.out.println("Displaying " + title);
    }
}

