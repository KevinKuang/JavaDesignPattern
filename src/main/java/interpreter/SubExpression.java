package interpreter;

import java.util.HashMap;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret(HashMap<String, Integer> var) {
        return super.left.interpret(var) - super.right.interpret(var);
    }
}
