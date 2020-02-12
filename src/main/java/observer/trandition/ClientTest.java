package observer.trandition;

import org.junit.Test;

/**
 * Created by Kevin on 2020/2/12.
 *
 * @author Kevin
 */
public class ClientTest {

    @Test
    public void test(){
        CurrentCondition  currentCondition1 = new CurrentCondition();

        WeatherData weatherData = new WeatherData();
        weatherData.addCondition(currentCondition1);
        weatherData.dataChange(10.2F,23.4F,1.02F);
        currentCondition1.display();

        System.out.println("================");
        CurrentCondition currentCondition2 = new CurrentCondition();
        weatherData.addCondition(currentCondition2);
        weatherData.dataChange(12.2F,13.4F,1.03F);
        currentCondition1.display();
        currentCondition2.display();
    }


}
