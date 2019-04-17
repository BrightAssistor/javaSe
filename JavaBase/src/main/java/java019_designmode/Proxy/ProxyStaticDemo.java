package java019_designmode.Proxy;

public class ProxyStaticDemo implements UserDao{
	 //接收保存目标对象
    private UserDao target;
    public ProxyStaticDemo(UserDao target){
        this.target=target;
    }
	@Override
	public void save() {
		System.out.println("静态代理，被代理类和代理类需实现相同接口");
		target.save();
		System.out.println("——————————————————————————————————————————————————————");
		
	}

}
