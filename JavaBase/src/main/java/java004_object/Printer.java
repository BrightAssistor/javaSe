package java004_object;

public abstract class Printer {
	private String brand;//牌子

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Printer(String brand) {
		super();
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Printer [brand=" + brand + "]";
	}

	public abstract void print();
}


class ColorPrinter extends Printer{

	public ColorPrinter(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.println("父类方法重写：彩色打印...");
	}
}	

class BlackPrinter extends Printer{

	public BlackPrinter(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.println("父类方法重写：黑白打印...");
	}
	
	public void showPrint(){
		System.out.println("子类独有方法：这是黑白打印机....");
	}
}








