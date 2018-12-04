package java015_thread;

public class ThreadDemo {
	public static void main(String[] args) {
		HellowThread thread1 = new HellowThread("线程1");
		HellowThread thread2 = new HellowThread("线程2");
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		thread2.start();
		
	}
}

class HellowThread extends Thread {
	public HellowThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getName()+"运行"+i);
		}
	}
}
