package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Kevin on 2020/2/10.
 *
 * @author Kevin
 */
public class TeacherProxyFactory {

    Teacher target;

    public TeacherProxyFactory(Teacher target) {
        this.target = target;
    }

    public Teacher getProxy(){
        Teacher proxy = (Teacher)Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (object, method, args) ->{
                    System.out.println("====JDK代理开始====");
                    Object returnVal =  method.invoke(target,args);
                    System.out.println("====提交====");
                    return returnVal;
                }
        );
        return proxy;
    }

}
