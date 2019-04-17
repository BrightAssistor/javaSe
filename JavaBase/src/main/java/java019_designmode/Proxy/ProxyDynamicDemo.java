package java019_designmode.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDynamicDemo {
	//维护一个目标对象
    private Object target;
    public ProxyDynamicDemo(Object target){
        this.target=target;
    }
    
    
    
  //给目标对象生成代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("动态代理,被代理类实现接口");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("————————————————————————————————————");
                        return returnValue;
                    }

                }
        );
    }
}
