package java021_arithmetic;

import com.sun.swing.internal.plaf.basic.resources.basic;

public class EqualsDemo {
	public static void main(String[] args) {
		
		String a = "看的";
		String b = "看的";
		if (a.equals(b)) {
			System.out.println("equals ok");
		}
		if (a == b) {
			System.out.println("== ok");
		}
		
		
		String c = new String("我");
		String d = new String("我");
		if (c.equals(d)) {
			System.out.println("equals ok");
		}
		if (c==d) {
			System.out.println("== ok");
		}else {
			System.out.println("== ng");
		}
		
	}
}
