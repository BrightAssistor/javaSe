package java001_datatype;

import java.util.Random;

public class MathRandomDemo {
	public static void main(String[] args) {
		System.out.println(Math.pow(2, 4));
		System.out.println(Math.random());//
		
		Random random = new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(10));//
		System.out.println(random.nextInt(10));
		
	}
}
