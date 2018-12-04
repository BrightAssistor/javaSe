package java011_exception;


public class ExceptionDemoforDefined {
	public static void main(String[] args)  {
			Bar bar = new Bar();
				try {
					System.out.println("start");
					bar.enter(1);
				} catch (AgeJudgeException e) {
					System.out.println(e.getMsg());
				}catch (Exception e) {
					System.out.println("你好");
				}finally{
					System.out.println("一定");
				}
		
	}
}

/**
 * 自定义的异常类，可以自定义参数描述异常信息，需继承exception
 * @author Administrator
 *
 */
class AgeJudgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	public AgeJudgeException(String msg) {
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}

/**
 * 一个自带异常机制的bar.run()方法；throw 出实例化后的异常，方法上throws声明
 * @author Administrator
 *
 */
class Bar{
	public void enter(int age) throws AgeJudgeException{
		if (age < 18) {
			throw new AgeJudgeException("年龄小于18，禁止入内");
		} else {
			System.out.println("欢迎光临");
		}
	}
}
