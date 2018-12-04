package java008_innerclass;

public class AnonymityClass {
	public static void main(String[] args) {
//		Animal animal = new Dog();
//		animal.eat();
		Animal animal = new Animal() {
			
			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("ffff1231242");
			}
			
		};
		
		animal.eat();
	}
}

abstract class Animal{
	abstract void eat();
}

/*class Dog extends Animal{

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("ffffffdsfd");
	}

}*/