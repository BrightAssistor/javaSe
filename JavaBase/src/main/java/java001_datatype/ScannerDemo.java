package java001_datatype;

import java.util.Scanner;


public class ScannerDemo {
	public static void main(String[] args) {
		String name1 = "jim";
		String pwd1 = "123456";
		
		System.out.println("欢迎来到");
		
		for (int i = 0; i < 3; i++) {
			Scanner in = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String name = in.next();
			System.out.println("请输入密码：");
			String pwd = in.next();
			if (name1.equals(name)) {
				if (pwd1.equals(pwd)) {
					System.out.println("登陆成功");
					break;
				} else {
					System.out.println("登陆失败，还剩余次数："+(2-i));
					
				}
			} else {
				System.out.println("登陆失败，还剩余次数："+(2-i));
			}
		}
	}
}
