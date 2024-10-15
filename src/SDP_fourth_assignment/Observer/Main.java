package Observer;

public class Main {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisherImpl();

        Observer phone = new NewsSubscriberSmartphone();
        Observer tablet = new NewsSubscriberLaptop();
        Observer laptop = new NewsSubscriberTablet();

        publisher.addObserver(phone);
        publisher.addObserver(tablet);
        publisher.addObserver(laptop);

        publisher.notifyObservers("Sport", "football!!!!! goal!!!!!!!!!");
        publisher.notifyObservers("Science", "iphone!!!!! goal!!!!!!!!!");
    }
}

