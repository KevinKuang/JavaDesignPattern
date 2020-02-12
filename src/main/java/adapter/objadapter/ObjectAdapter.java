package adapter.objadapter;

import adapter.GenerateDataInterface;
import adapter.OutputDataClass;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public class ObjectAdapter implements GenerateDataInterface {
    private OutputDataClass output;

    public ObjectAdapter(OutputDataClass output) {
        this.output = output;
    }

    @Override
    public String generate() {
        // 拿到原来的输出
        String old = output.output();
        // 修改它
        String[] array = old.split(",");
        StringBuilder sb = new StringBuilder();
        for (String str : array) {
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString();
    }
}
