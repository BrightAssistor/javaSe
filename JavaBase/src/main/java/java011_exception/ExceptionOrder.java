package java011_exception;

/**
 * 1.增加catch的顺序从子类到父类，不然会编译错误；
 * 2.进入catch的顺序先入为主，其他舍弃；如果catch中套catch时，抛出的其他类可以捕获
 * @author 14861
 *
 */
public class ExceptionOrder {
	public static void main(String[] args) {
		ExceptionOrder exceptionOrder = new ExceptionOrder();
		try {
			exceptionOrder.go(2);
		} catch (ExceptionB e) {
			System.out.println("我是异常b");
		} catch (ExceptionA e) {
			System.out.println("我是异常a");
		} catch (Exception e) {
			System.out.println("我是异常");
		}
	}

	public void go(int a) throws ExceptionB {
		a = 10/ a;
		throw new ExceptionB("异常：o不能为分母");
	}

}

class ExceptionA extends Exception {
	private String name;

	public ExceptionA(String name) {
		super();
		System.out.println("我是父类");
		this.name = name;
	}

}

class ExceptionB extends ExceptionA {
	
	public ExceptionB(String name) {
		super(name);
		System.out.println("我是子类");
	}

}