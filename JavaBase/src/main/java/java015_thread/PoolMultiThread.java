package java015_thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池管理多线程
 * @author bristor
 *
 */
public class PoolMultiThread {

	public static void main(String[] args) {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(10));
		for (int i = 0; i < 19; i++) {
			executor.execute(new RunnableDemo11(executor.getPoolSize(), executor.getQueue().size(), executor.getCompletedTaskCount(),i));
		}
		executor.shutdown();
	}

}




class RunnableDemo11 implements Runnable {
	private long poolSize;
	private long queueSize;
	private long completedTaskCount;
	private long taskNum;


	@Override
	public void run() {
		try {
			System.out.println(taskNum+"→******************************************************");
			Thread.sleep(1000);
			System.out.println(taskNum+"→线程池中线程数目："+poolSize+"，队列中等待执行的任务数目："+
					queueSize+"，已执行完别的任务数目："+completedTaskCount+":"+Thread.currentThread().getName()+":test");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public RunnableDemo11(long poolSize, long queueSize, long completedTaskCount,
			long taskNum) {
		super();
		this.poolSize = poolSize;
		this.queueSize = queueSize;
		this.completedTaskCount = completedTaskCount;
		this.taskNum = taskNum;
	}
	public long getTaskNum() {
		return taskNum;
	}
	public void setTaskNum(long taskNum) {
		this.taskNum = taskNum;
	}
	public long getPoolSize() {
		return poolSize;
	}
	public void setPoolSize(long poolSize) {
		this.poolSize = poolSize;
	}
	public long getQueueSize() {
		return queueSize;
	}
	public void setQueueSize(long queueSize) {
		this.queueSize = queueSize;
	}
	public long getCompletedTaskCount() {
		return completedTaskCount;
	}
	public void setCompletedTaskCount(long completedTaskCount) {
		this.completedTaskCount = completedTaskCount;
	}

}