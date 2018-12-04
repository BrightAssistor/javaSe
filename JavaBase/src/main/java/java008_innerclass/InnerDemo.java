package java008_innerclass;

public class InnerDemo {
	public static void main(String[] args) {
		AA aa = new AA();
//		DD dd = aa.make1();
//		dd.eat();
		aa.make1().eat();
	}
}
//外部类
class AA{
	//内部类
	class BB implements DD{
		private int age;
		
		public BB(int age) {
			super();
			this.age = age;
		}
		@Override
		public void eat() {
			// TODO Auto-generated method stub
			System.out.println("2134432676");
		}		
	}
	//内部类
	class CC implements EE{
		private int age;
		
		public CC(int age) {
			super();
			this.age = age;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("effefggh");
		}	
	}
	//外部类普通方法
	public DD make1(){
		return new BB(23);
	}
	//外部类普通方法
	public EE make2(){
		return new CC(23);
	}
}

interface DD{
	void eat();
}

interface EE{
	void run();
}









