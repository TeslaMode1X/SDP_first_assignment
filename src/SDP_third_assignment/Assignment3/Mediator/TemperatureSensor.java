package Assignment3.Mediator;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private final String name = "Home Temperature";
    private final Random random = new Random();


    // оптправляет данные в медиатор
    @Override
    public void sendData(HomeMediator mediator) {
        double temperature = 10 + (20 * random.nextDouble());

        mediator.receive(name, String.format("%.1f", temperature) + "°");
    }
}
