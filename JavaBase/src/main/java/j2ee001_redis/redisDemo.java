package j2ee001_redis;

import redis.clients.jedis.Jedis;

public class redisDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		System.out.println("服务正在运行: "+jedis.ping());
		jedis.clientSetname("javaClient");
		String clientList = jedis.clientList();
		System.out.println("clientList:"+clientList);

	}

}
