package java019_designmode;
/**
 * 单例模式
 * @author bristor
 *
 */
public class SingletonDemo {

	public static void main(String[] args) {
		Singleton_Hunger instance = Singleton_Hunger.getInstance();
		Singleton_Lazy instance2 = Singleton_Lazy.getInstance();
		System.out.println(instance);
		System.out.println(instance2);
	}

}


/**
 * 恶汉式单例
 * @author bristor
 *
 */
class Singleton_Hunger {
	//定义私有静态属性（自己创建自己，全局使用，只能创建一个实例）
	private static final Singleton_Hunger instance = new Singleton_Hunger();
	//定义私有构造方法
	private Singleton_Hunger() {
		
	}
	//定义静态方法返回实例
	public static Singleton_Hunger getInstance() {
		return instance;
		
	}
}


/**
 * 懒汉式单例
 * @author bristor
 *
 */
class Singleton_Lazy {
	//定义私有静态属性
	private static Singleton_Lazy instance = null;
	//定义私有构造方法
	private Singleton_Lazy(){
		
	}
	//三种返回实例方法任选一，建议最后一种；
	//定义静态方法返回实例(线程 不 安全)
	public static Singleton_Lazy getInstance1(){
		if (instance==null) {
			
			instance = new Singleton_Lazy();
		}
		return instance;
		
	}
	//定义静态方法返回实例(线程 安全 ，但是效率低)
	public static synchronized Singleton_Lazy getInstance2() {
		if (instance==null) {
			instance =new Singleton_Lazy();
		}
		return instance;
	}
	//定义静态方法返回实例（线程安全效率高）
	public static Singleton_Lazy getInstance() {
		if (instance==null) {
			synchronized (Singleton_Lazy.class) {
				if (instance==null) {
					instance=new Singleton_Lazy();
				}
			}
		}
		return instance;
		
	}
}