package java015_thread;

/**
 * 方法锁的作用锁对象：方法调用对象；
 * @author bristor
 *
 */
public class DieDemo2 {
	public static void main(String[] args) {
		Example2 example = new Example2();
		DieThread3 dieThread1 = new DieThread3(example,"线程1");
		DieThread4 dieThread2 = new DieThread4(example,"线程2");
		
		dieThread1.start();
		dieThread2.start();
	}
}

class Example2{
	private Object o1 = new Object();
	private Object o2 = new Object();
	
	public synchronized void method1(){
		synchronized (o1) {
			System.out.println("method1获取o1锁");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("method1等待o2锁。。。");
			synchronized (o2) {
				System.out.println("减肥");
			}
		}
	}
	
	public synchronized void method2(){
		synchronized (o2) {
			System.out.println("method2获取o2锁");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("method2等待o1锁。。。");
			synchronized (o1) {
				System.out.println("大哥");
			}
		}
	}
}

class DieThread3 extends Thread{
	private Example2 example;
	private String name;
	public DieThread3(Example2 example,String name){
		super(name);
		this.example = example;
	}
	
	@Override
	public void run() {
		example.method1();
		
	}
}

class DieThread4 extends Thread{
	private Example2 example;
	private String name;

	public DieThread4(Example2 example,String name){
		super(name);
		this.example = example;
	}
	
	@Override
	public void run() {
		example.method2();
	}
}












