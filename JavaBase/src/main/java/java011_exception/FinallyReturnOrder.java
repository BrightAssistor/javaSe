package java011_exception;
/**
 * 测试有return时trycatch执行顺序
 * 无论静态方法还是普通方法，无论正常try还是异常catch的return，最终结果都是舍弃finally中的修改；
 * @author 14861
 *
 */
public class FinallyReturnOrder {
	public static void main(String[] args) {
		int a = 7;
		System.out.println("___________________________静态方法______________________________________");
		System.out.println("结果："+FinallyReturnOrder.returnNormal(a));
		System.out.println("*************************************");
		System.out.println("结果："+FinallyReturnOrder.returnException(a));
		System.out.println("___________________________普通方法______________________________________");
		System.out.println("结果："+new FinallyReturnOrder().returnNormal2(a));
		System.out.println("*************************************");
		System.out.println("结果："+new FinallyReturnOrder().returnException2(a));
		
	}

	
	/**
	 * 静态方法中，
	 * 正常返回顺序:finally中的结果会在try结果的基础上执行finally并返回finally的结果；
	 * 传进的参数和本地参数一致
	 * @param a
	 * @return
	 */
	public static int returnNormal(int a) {
		int b =7;
		try {
			a = a+1;
			b = b+1;
			System.out.println("正常a："+a);
			System.out.println("正常b："+b);
			return a;
		} catch (Exception e) {
			a = a+2;
			b = b+2;
			System.out.println("异常a："+a);
			System.out.println("异常b："+b);
			return a;
		} finally {
			a = a+3;
			b = b+3;
			System.out.println("最终a："+a);
			System.out.println("最终b："+b);
		}
	}
	
	/**
	 * 静态方法中，
	 * 异常返回顺序:finally中的结果会在catch结果的基础上执行finally并返回finally的结果；
	 * 传进的参数和本地参数一致
	 * @param a
	 * @return
	 */
	public static int returnException(int a) {
		int b =7;
		try {
			a = a / 0;
			System.out.println("正常："+a);
			b = b / 0;
			System.out.println("正常："+b);
			return a;
		} catch (Exception e) {
			a = a + 2;
			System.out.println("异常："+a);
			b = b + 2;
			System.out.println("异常："+b);
			return a;
		} finally {
			a = a+3;
			System.out.println("最终："+a);
			b = b+3;
			System.out.println("最终："+b);
		}
	}
	
	public  int returnNormal2(int a) {
		int b =7;
		try {
			a = a+1;
			b = b+1;
			System.out.println("正常a："+a);
			System.out.println("正常b："+b);
			return a;
		} catch (Exception e) {
			a = a+2;
			b = b+2;
			System.out.println("异常a："+a);
			System.out.println("异常b："+b);
			return a;
		} finally {
			a = a+3;
			b = b+3;
			System.out.println("最终a："+a);
			System.out.println("最终b："+b);
		}
	}
	
	public static int returnException2(int a) {
		int b =7;
		try {
			a = a / 0;
			System.out.println("正常："+a);
			b = b / 0;
			System.out.println("正常："+b);
			return a;
		} catch (Exception e) {
			a = a + 2;
			System.out.println("异常："+a);
			b = b + 2;
			System.out.println("异常："+b);
			return a;
		} finally {
			a = a+3;
			System.out.println("最终："+a);
			b = b+3;
			System.out.println("最终："+b);
		}
	}
	
}
