package observer.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2020/2/12.
 *
 * @author Kevin
 */
public class WeatherData implements Subject {

    private float temp;
    private float humidity;
    private float pressure;

    private List<Observer> observerList = new ArrayList<>();

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void dataChange(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void remove(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        observerList.stream().forEach(o -> o.update(temp,humidity,pressure));
    }
}
