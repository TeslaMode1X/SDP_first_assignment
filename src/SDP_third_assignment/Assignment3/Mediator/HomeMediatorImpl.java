package Assignment3.Mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeMediatorImpl implements HomeMediator {
    private final List<Sensor> sensorList = new ArrayList<>();
    private final Map<String, String> reports = new HashMap<>();

    // сохраняет полученные данные с сенсоров
    @Override
    public void receive(String sensor, String data) {
        reports.put(sensor, data);
    }

    @Override
    public void addSensor(Sensor sensor) {
        sensorList.add(sensor);
    }

    // вызывает метод у Sensor, который сохраняет все данные с него в мапу reports
    public void collectData() {
        for (Sensor sensor : sensorList) {
            sensor.sendData(this);
        }
    }

    public void printReport() {
        System.out.println("Collected Data:");
        for (Map.Entry<String, String> entry : reports.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
