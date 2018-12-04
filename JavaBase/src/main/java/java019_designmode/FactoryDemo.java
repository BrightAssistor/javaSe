package java019_designmode;

public class FactoryDemo {
	public static void main(String[] args) {
		ICar iCar = Factory.getCarInstance("Maserati");
		iCar.drive();
		
		Factory.getCarInstance("Maserati").drive();
	}
}

interface ICar {
	void drive();
}

class Maserati implements ICar {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Maserati....");
	}

}

class BMW implements ICar {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("BMW....");
	}

}

// 简单工厂模式的核心：工厂类---根据传入的参数去创建一个具体的实例，并向上转型为接口作为结果返回
class Factory {
	public static ICar getCarInstance(String name) {
		if (name.equalsIgnoreCase("Maserati")) {
			return new Maserati();
		} else if (name.equalsIgnoreCase("BMW")) {
			return new BMW();
		}
		return null;
	}
}




