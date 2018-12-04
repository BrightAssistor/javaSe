package java001_datatype;

public class Test {
	public static void main(String[] args) {
		String enc = System.getProperty("file.encoding");
	    System.out.println(enc);
	    byte a=127;
	    Short b=1;
	    Integer c=129;
	    System.out.println(Integer.toBinaryString(10000));
	    System.out.println(Integer.toBinaryString(-100));
	    System.out.println(Integer.toBinaryString(-129));
	    System.out.println(Integer.toBinaryString(-1));
	    System.out.println(Long.toBinaryString(-1));
	    System.out.println(Short.reverseBytes(b));
	    System.out.println(Long.toBinaryString(-8));
	    System.out.println(Long.toBinaryString(8));
	    System.out.println('\u0002');
	}
}
