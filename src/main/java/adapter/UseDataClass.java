package adapter;

import adapter.GenerateDataInterface;

/**
 * Created by Kevin on 2020/2/7.
 * 这是客户端类，已经写死了，不希望修改
 * @author Kevin
 */
public class UseDataClass {

    public static String[] use(GenerateDataInterface generateDataInterface){
        return generateDataInterface.generate().split("\\s");
    }
}
