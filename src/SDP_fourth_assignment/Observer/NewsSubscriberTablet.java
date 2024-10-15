package Observer;

public class NewsSubscriberTablet implements Observer {
    @Override
    public void message(String category, String str) {
        System.out.println("Tablet received news: " + str);
    }
}
