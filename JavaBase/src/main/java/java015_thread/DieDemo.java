package java015_thread;

public class DieDemo {
	public static void main(String[] args) {
		Example example = new Example();
		DieThread1 dieThread1 = new DieThread1(example,"线程1");
		DieThread2 dieThread2 = new DieThread2(example,"线程2");
		
		dieThread1.start();
		dieThread2.start();
	}
}

class Example{
	private Object o1 = new Object();
	private Object o2 = new Object();
	
	public void method1(){
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
	
	public void method2(){
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

class DieThread1 extends Thread{
	private Example example;
	private String name;
	public DieThread1(Example example,String name){
		super(name);
		this.example = example;
	}
	
	@Override
	public void run() {
		example.method1();
		
	}
}

class DieThread2 extends Thread{
	private Example example;
	private String name;

	public DieThread2(Example example,String name){
		super(name);
		this.example = example;
	}
	
	@Override
	public void run() {
		example.method2();
	}
}












