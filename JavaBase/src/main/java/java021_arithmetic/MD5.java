package java021_arithmetic;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5 {
	public static String getMD5(String pwd) {
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			md.update(pwd.getBytes());
			return new BigInteger(1, md.digest()).toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return pwd;
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		String pwd =MD5.getMD5(scanner.next());
		System.out.println(pwd);
		
	}
}
