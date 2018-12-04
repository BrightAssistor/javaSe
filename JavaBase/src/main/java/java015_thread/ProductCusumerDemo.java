package java015_thread;

import java.util.LinkedList;

public class ProductCusumerDemo {
	public static void main(String[] args) {
		Basket basket = new Basket();
		Productor productor = new Productor(basket);
		Consumer consumer = new Consumer(basket);
		
		productor.start();
		consumer.start();
	}
}

class Apple {
	private int id;

	public Apple(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "苹果" + id;
	}

}

class Basket {
	private LinkedList<Apple> basket = new LinkedList<Apple>();

	// 放苹果
	private void push(Apple apple) {
		if (basket.size() == 5) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notify();
		basket.addFirst(apple);
		System.out.println("存放：" + apple);
	}

	// 取苹果
	private void pull() {
		if (basket.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notify();
		Apple apple = basket.removeFirst();
		System.out.println("取出：" + apple);
	}

	// 放20个苹果
	public synchronized void pushApple() {
		for (int i = 0; i < 20; i++) {
			Apple apple = new Apple(i);
			push(apple);
		}
	}

	//取20个苹果
	public synchronized void pullApple() {
		for (int i = 0; i < 20; i++) {
			pull();
		}
	}
}

//生产者
class Productor extends Thread{
	private Basket basket;

	public Productor(Basket basket) {
		super();
		this.basket = basket;
	}
	
	@Override
	public void run() {
		basket.pushApple();
	}
}

//消费者
class Consumer extends Thread{
	private Basket basket;

	public Consumer(Basket basket) {
		super();
		this.basket = basket;
	}
	
	@Override
	public void run() {
		basket.pullApple();
	}
}














