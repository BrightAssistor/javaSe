package java015_thread;

public class RunnableDemo {
	public static void main(String[] args) {
		HellowRunnable runnable = new HellowRunnable();
		Thread thread1 = new Thread(runnable, "线程1");
		Thread thread2 = new Thread(runnable, "线程2");
		
		thread1.start();
		thread2.start();
	}
	
}

class HellowRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"运行"+i);
		}
	}
	
}