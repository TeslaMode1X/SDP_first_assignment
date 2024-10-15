package Observer;

public class NewsSubscriberLaptop implements Observer {
    @Override
    public void message(String category, String str) {
        if (category.equals("Science")) {
            System.out.println("Laptop received news: " + str);
        }
    }
}
