package prototype.deepcopy.json;

import com.alibaba.fastjson.JSON;

import java.io.*;

/**
 * Created by Kevin on 2020/2/6.
 *
 * @author Kevin
 */
public class SerializeTool {
    public static Object serializeClone(Object o){

        String object2Json = JSON.toJSONString(o);
        return JSON.parseObject(object2Json, o.getClass());
    }
}
