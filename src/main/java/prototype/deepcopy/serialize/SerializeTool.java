package prototype.deepcopy.serialize;

import java.io.*;

/**
 * Created by Kevin on 2020/2/6.
 *
 * @author Kevin
 */
public class SerializeTool {
    public static Object serializeClone(Object o){

        Object clone = null;

        ByteArrayOutputStream bos;
        ObjectOutputStream oos;
        ByteArrayInputStream bis;
        ObjectInputStream ois;

        try {
            // 将对象输出到输出流
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(o);

            // 在从输入流中读回数据
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            clone = ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
