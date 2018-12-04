package java001_datatype;

import java.util.Scanner;
/**
 *  java是值传递
 * @author 14861
 *
 */
public class valueTransmit {

	String str = new String("good");
	char[] ch = { 'a', 'b', 'c' };

	public static void main(String args[]) {

		valueTransmit ex = new valueTransmit();
		ex.str = new String("test ok");
		ex.change(ex.str, ex.ch);
		System.out.print(ex.str + " and ");
		System.out.print(ex.ch);
	}

	public void change(String str2, char ch[]) {

		str2 = new String("value transmit");

		ch[0] = 'g';

	}

}
