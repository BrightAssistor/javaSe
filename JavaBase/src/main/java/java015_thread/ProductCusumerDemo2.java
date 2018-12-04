package java015_thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 多线程生产者与消费者
 * 生产者往盘子里放梨，盘子满n个了，休息1毫秒，先进先出；
 * 消费者从盘子里取梨，如果为空，休息1毫秒；
 * 生产者和消费者多个线程共同作用与同一个盘子，谁抢的快谁操作；
 * 消费过剩会崩溃，生产过剩时如果盘子只能放20个，过剩量小于 20安全否则崩溃；
 * @author bristor
 *
 */
public class ProductCusumerDemo2 {
	public static void main(String[] args) {
		Plate plate = new Plate(0, 20);

//		Productor1 productor1 = new Productor1(plate, "生产者1", 500000);
//		Productor1 productor2 = new Productor1(plate, "生产者2", 500000);
//		Productor1 productor3 = new Productor1(plate, "生产者3", 500000);
//		Consumer1 consumer1 = new Consumer1(plate, "消费者1", 500000);
//		Consumer1 consumer2 = new Consumer1(plate, "消费者2", 500000);
//		Consumer1 consumer3 = new Consumer1(plate, "消费者3", 500000);

//		productor1.start();
//		productor2.start();
//		productor3.start();
//		consumer1.start();
//		consumer2.start();
//		consumer3.start();
		ExecutorService threadPool1 = Executors.newFixedThreadPool(6);
		CountDownLatch countDownLatch = new CountDownLatch(6);
		for (int i = 1; i < 4; i++) {
			
			threadPool1.execute(new Productor1(plate, "生产者"+i, 20000,countDownLatch));
			threadPool1.execute(new Consumer1(plate, "消费者"+i, 20000,countDownLatch));
		}
		try {
			countDownLatch.await();
			Thread.sleep(10000);
			threadPool1.shutdown();
			for (int i = 0; i < 10; i++) {
				Thread.sleep(10000);
				System.out.println("wait a moment,look over jvm-tread-life");
			}
			System.out.println("end!!!!!!!!!!!!!!!!!!!!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Pear {
	private int id;

	public Pear(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "梨" + id;
	}

}

/*
 * 盘子
 */
class Plate {
	private LinkedList<Pear> plate = new LinkedList<Pear>();
	private int mincount;// 最小存放数量
	private int maxcount;// 最大存放数量

	public Plate() {
		super();
	}

	public Plate(int mincount, int maxcount) {
		super();
		this.mincount = mincount;
		this.maxcount = maxcount;
	}

	// 放梨
	private synchronized void push(Pear pear) throws InterruptedException {
		while (plate.size() >= maxcount) {
			wait();
		}
		notify();
		plate.addFirst(pear);
		System.out.println(new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss:SSS")
				.format(new Date())
				+ "["
				+ Thread.currentThread().getName()
				+ "]存放后剩余" + plate.size() + ":" + plate);
	}

	// 取梨
	private synchronized void pull() throws InterruptedException {
		while (plate.size() == mincount) {
			wait();
		}
		notify();

		plate.removeLast();
		System.out.println(new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss:SSS")
				.format(new Date())
				+ "["
				+ Thread.currentThread().getName()
				+ "]取出后剩余" + plate.size() + ":" + plate);
	}

	// 放count个梨
	public void pushPear(int count) throws InterruptedException {
		for (int i = 0; i < count; i++) {
			Pear pear = new Pear(i);
			push(pear);
		}
	}

	// 取count个梨
	public void pullPear(int count) throws InterruptedException {
		for (int i = 0; i < count; i++) {
			pull();
		}
	}

	public LinkedList<Pear> getPlate() {
		return plate;
	}

	public void setPlate(LinkedList<Pear> plate) {
		this.plate = plate;
	}

}

// 生产者
class Productor1 extends Thread {
	private Plate plate;
	private String name;
	private int count;// 待生产数量
	private CountDownLatch countDownLatch;
	
	public Productor1() {
		super();
	}

	public Productor1(Plate plate, String name, int count,CountDownLatch countDownLatch) {
		super(name);
		this.plate = plate;
		this.name = name;
		this.count = count;
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		try {
			Thread.currentThread().setName(name);
			plate.pushPear(count);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			countDownLatch.countDown();
		}
	}
}

// 消费者
class Consumer1 extends Thread {
	private Plate plate;
	private String name;
	private int count;// 待消费数量
	private CountDownLatch countDownLatch;

	public Consumer1() {
		super();
	}

	public Consumer1(Plate plate, String name, int count,CountDownLatch countDownLatch) {
		super(name);
		this.plate = plate;
		this.name = name;
		this.count = count;
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		try {
			Thread.currentThread().setName(name);
			plate.pullPear(count);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			countDownLatch.countDown();
		}
	}
}
