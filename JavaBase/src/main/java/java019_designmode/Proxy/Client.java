package java019_designmode.Proxy;

public class Client {

	public static void main(String[] args) {
		//静态代理
		UserDaoImpl user = new UserDaoImpl();
		ProxyStaticDemo staticProxy = new ProxyStaticDemo(user);
		staticProxy.save();
		
		
		//动态代理
		UserDao dynamicProxy =(UserDao)new ProxyDynamicDemo(user).getProxyInstance();
		dynamicProxy.save();
		
		//cglib代理
		UserDao2 userDao2 = new UserDao2();
		UserDao2 cglibProxy=(UserDao2)new ProxyCglibDemo(userDao2).getProxyInstance();
		cglibProxy.save();
	}

}
