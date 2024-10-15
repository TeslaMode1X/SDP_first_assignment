package Observer;

// interface which manages with publisher
public interface NewsPublisher {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String category, String news);
}
