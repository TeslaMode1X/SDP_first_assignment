package SDP_first_assignment.src.SDP_second_assignment.Assignment2.Facade;
import Assignment2.Bridge.DocumentRenderer;
import Assignment2.Bridge.RenderEngine;
import Assignment2.Bridge.SimpleDocumentRenderer;
import Assignment2.Bridge.SimpleRenderEngine;
import Assignment2.Decorator.WatermarkDecorator;
import Assignment2.Document;
import Assignment2.Flyweight.DocumentFactory;
import Assignment2.RealDocument;

// Фасад для работы с документами
public class DocumentFacade {
    //Задачи:
    //Метод для отображения документа:
    //Используйте фабрику документов, чтобы получить документ по заданному заголовку.
    //Вызовите метод для отображения документа.
    public void displayDocument(String title) {
        Document document = DocumentFactory.getDocument(title);
        document.display();
    }

    //Метод для отображения документа с водяным знаком:
    //Получите документ по заголовку с помощью фабрики документов.
    //Оберните полученный документ декоратором, который добавляет водяной знак.
    //Вызовите метод для отображения обёрнутого документа.
    public void displayDocumentWithWatermark(String title) {
        Document document = DocumentFactory.getDocument(title);
        WatermarkDecorator waterMark = new WatermarkDecorator(document);
        waterMark.display();
    }

    //Метод для рендеринга документа:
    //Создайте объект рендерера, передав в конструктор выбранный движок рендеринга.
    //Вызовите метод рендеринга в рендерере для заданного документа.
    public void renderDocument(String context, RenderEngine renderEngine) {
        Document document = DocumentFactory.getDocument(context);
        DocumentRenderer renderer = new SimpleDocumentRenderer(renderEngine);
        renderer.render(document.getTitle());
    }
}

