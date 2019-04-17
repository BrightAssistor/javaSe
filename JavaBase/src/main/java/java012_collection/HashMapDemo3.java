package java012_collection;

public class HashMapDemo3 {
	static final int MAXIMUM_CAPACITY = 1 << 30;

	public static void main(String[] args) {
		int tableSizeFor = tableSizeFor(7);
		System.out.println(tableSizeFor);
		System.out.println(Integer.toBinaryString(8));
		System.out.println(Integer.toBinaryString(-18));
	}
	//
	/**
	 * 结果：
	 * 将数字n变为比n大的最小的2的次幂，如3变成4（2^2）；5变为8(2^3)，小于等于0的数都返回1；
	 * 
	 * 规律：
	 * Java基本数据类型int是32位由0和1组成的二进制数；
	 * 十进制中所有2的次幂的数在二进制中只有一个1；如8：1000（前面28位0省略）；
	 * 2的次幂的数-1都会变成后移一位全是1；如8-1变成0111；
	 * >>>表示右移补零；如0111右移1位补零变成0011；
	 * 
	 * 
	 * 逻辑：
	 * 中间过程使数字全部变为1
	 * 本身与本身右移n位进行与或运算；
	 * 输入的8，减1变成n=7;7:0111
	 * 0111与右移一位的0011进行与或预算；每位对照只要有一个1则为1；结果0111
	 * 后面一直到与移动16的比较，0111与0000，结果依旧是0111；
	 * 最后+1变成1000结果为8；
	 * 
	 * 
	 * 补充：
	 * 移动一位则前两位都是1；移动两位则前四位都是11，移动四位则前8位都是1；。。。移动16位则32位全是1，最后+1则变为100000**00；即2的次幂数；
	 * @param cap
	 * @return
	 */
	static final int tableSizeFor(int cap) {
		int n = cap - 1;
		n |= n >>> 1;
		n |= n >>> 2;
		n |= n >>> 4;
		n |= n >>> 8;
		n |= n >>> 16;
		return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
	}
}
