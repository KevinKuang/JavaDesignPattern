package interpreter;

import java.util.HashMap;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret(HashMap<String, Integer> var) {
        // super.left.interpret(var)返回做表达式对应的值
        return super.left.interpret(var) + super.right.interpret(var);
    }
}
