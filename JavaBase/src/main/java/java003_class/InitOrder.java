package java003_class;
/**
 * 测试类实例化时，内部成员加载顺序
 * @author zhou
 *
 */
public class InitOrder {
	/**
	 * 实例化order，调用普通方法和调用静态方法测试
	 * @param args
	 * @return 结论：第一：  若调用静态方法不会实例化类，只加载类的静态方法和属性；
	 * 				           而调用普通方法会实例化类，并且加载所有方法和属性；
	 * 			         第二：类实例化顺序：
	 * 					①首先加载静态属性和静态代码块，两者谁在上面先执行谁；
	 * 					②其次加载普通属性和普通方法块，两者谁在上面先执行谁；
	 * 					③然后加载构造方法
	 * 					④最后执行所调用的方法
	 */
	public static void main(String[] args) {
//		Order.result_static();//不实例化类，也会进行加载，只加载静态的成员
		System.out.println("************************************");
		Order order = new Order();
		order.result_common();
	}
}


/**
 * 测试类：定义普通属性、静态属性；构造方法；普通代码块，静态代码块；普通方法，静态方法；
 * @author zhou
 * @return 调换任意位置，查看输出结果的顺序
 * 
 */
class Order{
	
	public Order() {
		System.out.println("*****构造方法*******");
	}
	
	
	{
		System.out.println("普通代码块………………………………………………………………………………………………………………………");
	}
	private Attribute_common attribute_common = new Attribute_common();
	
	static{
		System.out.println("静态代码块……………………………………………………");
	}
	private static Attribute_static attribute_static = new Attribute_static();
	
	public static void result_static() {
		System.out.println("静态方法");
	}
	public void result_common() {
		System.out.println("普通方法");
	}
}



/**
 * 测试类：实例化后构造方法输出普通属性
 * @author zhou
 *
 */
class Attribute_common{
	public Attribute_common() {
		System.out.println("普通属性");
	}
}



/**
 * 测试类：实例化后构造方法输出静态属性
 * @author Administrator
 *
 */
class Attribute_static{
	public Attribute_static() {
		System.out.println("静态属性");
	}
}

