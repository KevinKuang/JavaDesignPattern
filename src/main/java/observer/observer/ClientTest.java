package observer.observer;

import org.junit.Test;

import java.util.*;

/**
 * Created by Kevin on 2020/2/12.
 *
 * @author Kevin
 */
public class ClientTest {
    @Test
    public void test(){
        CurrentCondition  currentCondition = new CurrentCondition();

        WeatherData weatherData = new WeatherData();
        weatherData.register(currentCondition);
        weatherData.dataChange(10.2F,23.4F,1.02F);
        currentCondition.display();

        System.out.println("================");
        SinaCondition sinaCondition = new SinaCondition();
        weatherData.register(sinaCondition);
        weatherData.dataChange(12.2F,13.4F,1.03F);
        currentCondition.display();
        sinaCondition.display();
    }
}
