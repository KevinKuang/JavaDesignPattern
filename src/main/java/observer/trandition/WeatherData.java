package observer.trandition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2020/2/12.
 *
 * @author Kevin
 */
public class WeatherData {
    private float temp;
    private float humidity;
    private float pressure;

    private List<CurrentCondition> conditionList = new ArrayList<>();

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
        conditionList.stream().forEach(c -> c.update(temp,humidity,pressure));
    }

    public void addCondition(CurrentCondition currentCondition){
        conditionList.add(currentCondition);
    }
}
