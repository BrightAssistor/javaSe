package java0999_temp;

/**
 * 如果类继承一个类并实现一个接口，接口和被继承类中有相同的方法，则不用重写
 * @author bristor
 *
 */
public class ImplementsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet pet = new Pet();
		System.out.println();
	}

}


class Dog{
	public void bark() {
		System.out.println("It's dog");
	}
}
interface Cat{
	public void bark();
	public void eat();
}
abstract class Goose{
	public abstract void eat();
}
class Pet extends Dog implements Cat{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
}

/**
 * 
 * @author bristor
 *
 */
class Pet2 extends Goose {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	
}