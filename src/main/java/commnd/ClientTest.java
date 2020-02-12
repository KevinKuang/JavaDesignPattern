package commnd;

import org.junit.Test;

/**
 * Created by Kevin on 2020/2/10.
 *
 * @author Kevin
 */
public class ClientTest {

    @Test
    public void test(){

        final int LIGHT_NO = 0;

        // 创建接受者
        Light light = new Light();

        // 创建命令
        LightCommand lightOnCommand = new LightOnCommand(light);
        LightCommand lightOffCommand = new LightOffCommand(light);

        // 创建遥控器
        RemoteController controller = new RemoteController();
        controller.setCommand(LIGHT_NO,lightOnCommand,lightOffCommand);

        // 按下按键
        controller.pushOnButton(LIGHT_NO);
        controller.pushOffButton(LIGHT_NO);
        controller.pushUndoButton();

    }
}
