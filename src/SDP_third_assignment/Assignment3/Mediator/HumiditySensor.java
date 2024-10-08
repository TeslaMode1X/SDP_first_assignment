package Assignment3.Mediator;

import java.util.Random;

public class HumiditySensor implements Sensor {
    private final String name = "Home Humidity";
    private final Random random = new Random();

    @Override
    public void sendData(HomeMediator mediator) {
        double humidity = 10 + (90 * random.nextDouble());

        mediator.receive(name, String.format("%.1f", humidity) + "%");
    }
}
