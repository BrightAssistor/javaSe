package java015_thread;

public class TicketDemo {
	public static void main(String[] args) {
//		TicketThread thread1 = new TicketThread("窗口1");
//		TicketThread thread2 = new TicketThread("窗口2");
//		
//		thread1.start(); 
//		thread2.start(); 
		
		TicketRunnable runnable = new TicketRunnable();
		Thread thread1 = new Thread(runnable, "窗口1");
		Thread thread2 = new Thread(runnable, "窗口2");
		
		thread1.start(); 
		thread2.start(); 
		
	}
}

class TicketThread extends Thread{
	private /*static*/ int ticketCount = 5;
	
	public TicketThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		 while (true) {
			System.out.println(this.getName()+"剩余票数："+(--ticketCount));
			if (ticketCount < 1) {
				break;
			}
		}
	}
}

class TicketRunnable implements Runnable{
	private  int ticketCount = 5;//多个线程共享

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (ticketCount > 0) {
			System.out.println(Thread.currentThread().getName()+"剩余票数："+(--ticketCount));
			
		}
	}
}



















