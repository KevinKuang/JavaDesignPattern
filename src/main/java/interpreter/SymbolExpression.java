package interpreter;

import java.util.HashMap;

/**
 * Created by Kevin on 2020/2/13.
 * 运算符号解析器
 * @author Kevin
 */
public class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(HashMap<String, Integer> var) {
        // 默认实现
        return 0;
    }
}
