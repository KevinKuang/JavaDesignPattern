package interpreter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class Calculator {

    public Calculator() {
    }

    public int run(String expStr) {
        Stack<Expression> stack = new Stack<>();

        char[] charArray = expStr.toCharArray();
        String[] strArray = toStringArray(charArray);

        Expression left = null;
        Expression right = null;

        for (int i = 0; i < strArray.length; i++) {
            sw:switch (strArray[i]){
                case "+":
                    left = stack.pop();
                    right = new VarExpression(strArray[++i]);
                    stack.push(new AddExpression(left, right));
                    break sw;
                case "-":
                    left = stack.pop();
                    right = new VarExpression(strArray[++i]);
                    stack.push(new SubExpression(left, right));
                    break sw;
                case "":
                    break sw;
                default:
                    stack.push(new VarExpression(strArray[i]));
                    break sw;
            }
        }

        Expression expression = stack.pop();

        return expression.interpret(inputValue(strArray));
    }


    private String[] toStringArray(char[] charArray){
        String[] stringArray = new String[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            stringArray[i] = String.valueOf(charArray[i]);
        }
        return stringArray;
    }


    public HashMap<String , Integer> inputValue(String[] strArray){
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strArray.length; i++) {
            if (!"+".equals(strArray[i]) && !"-".equals(strArray[i])){
                if (!map.containsKey(strArray[i])){
                    Scanner sc = new Scanner(System.in);
                    System.out.print(strArray[i]+"=");
                    int num = sc.nextInt();
                    map.put(strArray[i],num);
                }
            }
        }
        return map;
    }

}
