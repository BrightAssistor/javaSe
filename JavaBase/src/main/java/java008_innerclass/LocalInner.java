package java008_innerclass;


public class LocalInner {
	public static void main(String[] args) {
		OuterLocal outerLocal = new OuterLocal();
		outerLocal.show();
	}
}

class OuterLocal{
	private String name = "第三方的";
	
	public void show(){
		final int num = 35; //局部內部类使用作用域内的变量，该变量需要用final修饰
		//---局部内部类
		class Inner{//局部內部不能加访问修饰符
			private int age = 30; 
			
			public void sleeping(){
				System.out.println(OuterLocal.this.name);
				System.out.println(age);
				System.out.println(num);
			}
		}
		//对外部世界完全隐藏，智能在其作用域内生成对象
		Inner inner = new Inner();
		inner.sleeping();
		
	}
}
