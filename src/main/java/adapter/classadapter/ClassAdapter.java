package adapter.classadapter;

import adapter.GenerateDataInterface;
import adapter.OutputDataClass;

/**
 * Created by Kevin on 2020/2/7.
 * 适配器方法
 * @author Kevin
 */
public class ClassAdapter extends OutputDataClass implements GenerateDataInterface {
    @Override
    public String generate() {
        // 拿到原来的输出
        String old = super.output();
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
