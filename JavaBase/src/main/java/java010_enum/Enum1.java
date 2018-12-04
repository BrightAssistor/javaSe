package java010_enum;


public class Enum1 {
	public static void main(String[] args) {
		System.out.println(Color.RED);
		Color[] values = Color.values();//得到枚举类中所有的值，放在一个数组中
		//增强for循环
		for (Color c : values) {
			System.out.println(c);
		}
	}
}

//枚举类
enum Color{
	//public static final Color RED = new Color();
	RED,BlUE,BLACK
	
	
}