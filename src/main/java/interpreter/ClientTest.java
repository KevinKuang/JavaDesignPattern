package interpreter;

import org.junit.Test;

import java.util.Scanner;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class ClientTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入表达式");
        String exp = sc.next();
        int num = calculator.run(exp);
        System.out.println(String.format("%s=%d",exp,num));
    }
}
