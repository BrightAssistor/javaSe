package java015_thread;

import java.util.Date;

public class TestThread1 {

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread thread1 = new Thread(mr);
		Thread thread2 = new Thread(mr);
		thread1.start();
		thread2.start();
	}

}

class MyRunnable implements Runnable {

	@Override
	public synchronized void run() {
		for (int i = 0; i < 1; i++) {
			System.out.println(Thread.currentThread().getName() + ":"
					+ new Date());
			try {
				Thread.sleep(1000);
				this.notify();
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.notify();
	}

}
