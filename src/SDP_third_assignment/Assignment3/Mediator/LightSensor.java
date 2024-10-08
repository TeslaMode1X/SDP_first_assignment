package Assignment3.Mediator;

import java.util.Random;

public class LightSensor implements Sensor {
    private final String name = "Brightness Level";
    private final Random random = new Random();

    @Override
    public void sendData(HomeMediator mediator) {
        double brightness = 10 + (90 * random.nextDouble());

        mediator.receive(name, String.format("%.1f", brightness) + "%");
    }
}
