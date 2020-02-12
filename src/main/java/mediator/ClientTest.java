package mediator;

import org.junit.Test;

/**
 * Created by Kevin on 2020/2/12.
 *
 * @author Kevin
 */
public class ClientTest {

    @Test
    public void test(){

        Mediator mediator = new SmartHouse();


        Alarm alarm = new Alarm(mediator,"alarm");

        Curtain curtain1 = new Curtain(mediator,"curtain1");
        Curtain curtain2 = new Curtain(mediator,"curtain2");

        TV tv = new TV(mediator, "TV");


        alarm.ring(0);
        System.out.println("==============");
        alarm.ring(1);
    }


}
