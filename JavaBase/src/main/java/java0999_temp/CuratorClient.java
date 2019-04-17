package java0999_temp;

import java.util.concurrent.TimeUnit;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.utils.ZKPaths;
import org.apache.zookeeper.data.Stat;

public class CuratorClient {

	public static void main(String[] args) {
		RetryPolicy policy = new ExponentialBackoffRetry(1000, 6);
		CuratorFramework framework = CuratorFrameworkFactory.builder()
		.connectString("127.0.0.1:2081")
		.connectionTimeoutMs(3*1000)
		.sessionTimeoutMs(30*1000)
		.retryPolicy(policy)
		.build();
		framework.start();
		try {
			framework.blockUntilConnected(3, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		String makePath = ZKPaths.makePath("work", "temp");
		System.out.println(makePath);//result:work/temp
		
		
		
		try {
			Stat forPath = framework.checkExists().forPath(makePath);
			if (forPath == null) {
				ZKPaths.mkdirs(framework.getZookeeperClient().getZooKeeper(), makePath);
				
			}
			framework.setData().inBackground().forPath(makePath,"testvalues".getBytes());
			
			framework.getData().forPath(makePath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
