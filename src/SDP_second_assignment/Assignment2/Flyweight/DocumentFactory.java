package SDP_first_assignment.src.SDP_second_assignment.Assignment2.Flyweight;
import Assignment2.Document;
import Assignment2.Proxy.ProxyDocument;
import Assignment2.RealDocument;
import java.util.HashMap;
import java.util.Map;

// Фабрика для создания и переиспользования документов
public class DocumentFactory {
    private static final Map<String, Document> documentMap = new HashMap<>();

    // Задача: Реализуйте фабрику, которая будет хранить и переиспользовать документы,
    // чтобы не создавать их повторно для одного и того же заголовка.
    public static Document getDocument(String title) {
        if (documentMap.containsKey(title)) {
            return documentMap.get(title);
        }
        Document newDocument = new ProxyDocument(title);
        documentMap.put(title, newDocument);
        return newDocument;
    }
}

