package java015_thread;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class BankDemo {
	public static void main(String[] args) {
		Bank bank = new Bank();
		BankThread thread1 = new BankThread(bank, "ATM");
		BankThread thread2 = new BankThread(bank, "柜台");
		Thread thread = new Thread();
		thread1.start();
		thread2.start();
		
	}
}


class Bank{
	private int money = 500;
	Object object = new Object();
	//取钱方法
	public int getMoney(int number){
		synchronized (object) {
			if (number < 0) {
				return -1;
			}else if (money < 0) {
				return -2;
			}else if (number - money > 0) {
				return -3;
			}else {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				money -= number;
				System.out.println("余额："+money);
			}
			
		}
	
		return number;
	}
}

class BankThread extends Thread{
	private Bank bank = null;
	
	public BankThread(Bank bank,String name){
		super(name);
		this.bank = bank;
	}
	
	@Override
	public void run() {
		System.out.println(super.getName()+"取钱:"+bank.getMoney(400));
	}
}













