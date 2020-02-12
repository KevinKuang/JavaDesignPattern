package proxy.gclibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Kevin on 2020/2/10.
 *
 * @author Kevin
 */
public class TeacherProxyFactory implements MethodInterceptor {

    private TeacherImpl target;

    public TeacherProxyFactory(TeacherImpl target) {
        this.target = target;
    }

    public TeacherImpl getProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return (TeacherImpl) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("====Cglib代理开始====");
        Object returnVal = method.invoke(target, args);
        System.out.println("====提交====");
        return returnVal;
    }
}
