package Observer;

public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void message(String category, String str) {
        if (category.equals("Sport")) {
            System.out.println("Mobile phone received news: " + str);
        }
    }
}
