package factory.function.order.tool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Kevin on 2020/2/6.
 *
 * @author Kevin
 */
public class InputTypeTool {
    public static String getType(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入披萨种类：");
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
