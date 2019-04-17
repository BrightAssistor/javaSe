package java004_object;

public class FatherUseSon {
	public static void main(String[] args) {
		//父类引用变量引用子类对象
		Printer cprinter = new ColorPrinter("惠普");//向上转型
		cprinter.print();
		Printer bprinter = new BlackPrinter("惠普");
		bprinter.print();
		//父类引用变量不可以调用子类方法，只能调用父类有的方法和子类重写父类的方法
		//bprinter.showPrint();
		
		BlackPrinter bb = (BlackPrinter)bprinter;//向下转型
		System.out.println(bb.getBrand()+"hjkjk"+bprinter.getBrand());
		bb.print();
		bb.showPrint();
		if (bprinter instanceof ColorPrinter) {
			ColorPrinter cc = (ColorPrinter)bprinter;//向下转型
			System.out.println("转型成功");
		}
		
		BlackPrinter aa = new BlackPrinter("sdfsdf");
		
		FatherUseSon.pp(aa);
			
	}
	
	public static void pp(BlackPrinter sd){
		System.out.println(sd);
	}
	
}
