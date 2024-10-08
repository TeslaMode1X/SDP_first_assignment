package Assignment3.Mediator;

public class Main {
    public static void main(String[] args) {
        HomeMediatorImpl mediator = new HomeMediatorImpl();

        Sensor temperatureSensor = new TemperatureSensor();
        Sensor humiditySensor = new HumiditySensor();
        Sensor lightSensor = new LightSensor();

        mediator.addSensor(temperatureSensor);
        mediator.addSensor(humiditySensor);
        mediator.addSensor(lightSensor);

        mediator.collectData();

        mediator.printReport();
    }
}
