package SDP_first_assignment.src.SDP_second_assignment.Assignment2.Decorator;

import Assignment2.Decorator.DocumentDecorator;
import Assignment2.Document;

// Декоратор для добавления водяного знака к документу
public class WatermarkDecorator extends DocumentDecorator {
    public WatermarkDecorator(Document decoratedDocument) {
        super(decoratedDocument);
    }

    // Задача: Реализуйте логику, которая сначала отображает документ, а затем добавляет к нему водяной знак.
    @Override
    public void display() {
        super.display();
        System.out.println("Adding watermark to it");
    }

    @Override
    public String getTitle() {
        return null;
    }
}

