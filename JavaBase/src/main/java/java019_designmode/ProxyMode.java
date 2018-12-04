package java019_designmode;

/**
 * 代理模式：我们通过调用代理来间接实现被代理类所做的事
 * @author Bristor
 *
 */
public class ProxyMode {
	public static void main(String[] args) {
		//我想买辆ossp，第一种：亲自去
		BuyCarImpl buyCarImpl = new BuyCarImpl();
		System.out.println("①早起亲自坐地铁出发买雪佛兰");
		buyCarImpl.buy();
		System.out.println("⑦唉，奔波一天，心累，下周末再去吧 ；");
		System.out.println("**************************************************");
		
		
		System.out.println("①对了，要不找个雪佛兰代购吧");
		Proxy proxy = new Proxy();
		proxy.buy();
		System.out.println("③方便快捷，五星好评！！！");
	}
}

/**
 * 有买车的想法
 * @author Administrator
 *
 */
abstract class BuyCar{
	abstract void buy();
}

/**
 * 买车的想法实践起来
 * @author Administrator
 *
 */
class BuyCarImpl extends BuyCar{
	private int price;//价格怎么最实惠
	private String vihicleModel;//车型什么样的好
	private String color;//颜色怎么百搭
	private String place;//实体店远不远
	private String dealer;//经销商哪家好
	/**
	 * 买车需要了解车型，价格，外观等等一系列繁琐的事件
	 * @author Administrator
	 *
	 */
	@Override
	void buy() {
		System.out.println("了解车型");
		System.out.println("了解价格");
		System.out.println("了解外观");
		System.out.println("了解卖家");
		System.out.println("去实体店");
	}
	
}

/**
 * 我是代理类，专业代购，黄牛，上天入地
 * @author Administrator
 *
 */
class Proxy extends BuyCar{
	private BuyCar buyCar = new BuyCarImpl();
	
	/**
	 * 找代购，包您满意
	 */
	@Override
	void buy() {
		//代理在买车前，询问需求
		System.out.println("②我是代购，告诉我要买什么车，我下面去帮您挑选→【");
		//代理去买车
		buyCar.buy();
		//代理买车后，给车包装下，洗一下，送货上门
		System.out.println("】→经过一路奔波，您想要的车开到您家门口，出来看看吧");
	}
	
}
