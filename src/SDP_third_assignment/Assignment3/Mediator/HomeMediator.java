package Assignment3.Mediator;

public interface HomeMediator {
    void receive(String sensor, String data);

    void addSensor(Sensor sensor);
}
