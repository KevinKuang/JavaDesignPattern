package observer.trandition;

/**
 * Created by Kevin on 2020/2/12.
 *
 * @author Kevin
 */
public class CurrentCondition {
    private float temp;
    private float humidity;
    private float pressure;

    // 更新由其它人推送过来
    public void update(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void display(){
        System.out.println("temp = " + temp);
        System.out.println("humidity = " + humidity);
        System.out.println("pressure = " + pressure);
    }
}
