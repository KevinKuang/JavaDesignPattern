package interpreter;

import java.util.HashMap;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class VarExpression extends Expression {

    // key 是变量的名字
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpret(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
