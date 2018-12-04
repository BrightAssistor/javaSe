package java008_innerclass;

public class MemberClass {
	private int num = 12;
	private String name = "战三";
	
	public void eat(){
		System.out.println("外部类...");
//		System.out.println(num2);//外部类不能直接使用内部类的属性和方法
//		eat2();
	}
	
	//成员内部类
	class Inner{
		private int num2 = 34;
//		private static int num3 = 67;//内部类不可以使用静态属性和方法
		private static final int NUM3 = 67;//静态常量可以使用
		private String name2s = "商店";
		
		public void eat2(){
			//访问外部类属性和方法：外部类名.this.属性或方法
			System.out.println(MemberClass.this.num);
			MemberClass.this.eat();
			System.out.println("内部类...");
		}
		
	}
	
	public static void main(String[] args) {
		//创建内部类必须先创建外部类
		MemberClass outer = new MemberClass();
		MemberClass.Inner inner = outer.new Inner();
		inner.eat2();
		System.out.println(inner.num2);
	}
}
