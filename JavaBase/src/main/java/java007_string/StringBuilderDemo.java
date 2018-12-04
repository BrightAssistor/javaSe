package java007_string;

public class StringBuilderDemo {
	public static void main(String[] args) {
		//StringBuilder sb = "qwerdf";//沒有这种聲明方法
		
		StringBuilder sb = new StringBuilder("哈哈");
		StringBuilder sb2 = new StringBuilder(35);
		
		System.out.println(sb);
		sb.append("dwfdf");
		sb.append(42314);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());//容量
		sb.insert(2, "mmmm");//指定位置插入字符串
		System.out.println(sb);
		System.out.println(sb.reverse());//倒置或反转
		System.out.println(sb.indexOf("mmmm"));
	}
	
}
