package java008_innerclass;

public class StaticInner {
	public static void main(String[] args) {
		Outer2.Inner inner = new Outer2.Inner();
		inner.run2();
	}
}


class Outer2{
	private int num =24;
	private static int num4 =100;
	
	public void run(){
		System.out.println("外部类在跑1...");
		//System.out.println(num2);外部类不能直接使用静态内部类非静态的属性和方法
		//run2();
		System.out.println(Inner.num3);
		Inner.run3();
	}
	
	public static void run4(){
		System.out.println("外部类在跑4...");
	}
	
	//静态内部类
	static class Inner{
		private int num2 =24;
		private static int num3 =24;
		
		public void run2(){
			System.out.println("内部类在跑2...");
			//静态内部类不能使用外部类非静态的属性和方法
			//System.out.println(num);
			//run();
			//静态内部类可以使用外部类静态的属性和方法
			run4();
			System.out.println(num4);
		}
		
		public static void run3(){
			System.out.println("内部类在跑3...");
		}
		
	}
}


