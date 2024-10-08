package SDP_first_assignment.src.SDP_second_assignment.Assignment2.Adapter;

import Assignment2.Adapter.PDFDocument;
import Assignment2.Document;

// Адаптер для интеграции PDF документа
public class PDFDocumentAdapter implements Document {
    private PDFDocument pdfDocument;

    public PDFDocumentAdapter(String fileName) {
        this.pdfDocument = new PDFDocument(fileName);
    }

    //Задача: Реализуйте логику для адаптера, чтобы методы PDF-документа могли быть использованы через интерфейс Document.
    @Override
    public void display() {
        pdfDocument.openPDF();
        pdfDocument.showPDF();
    }

    @Override
    public String getTitle() {
        return pdfDocument.toString();
    }
}

