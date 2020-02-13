package interpreter;

import java.util.HashMap;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public abstract class Expression {

    // 通过map得到变量的值
    public abstract int interpret(HashMap<String, Integer> var);
}
