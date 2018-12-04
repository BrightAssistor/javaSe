package java002_array;

public class OneArray {
	public static void main(String[] args) {
		//第一种
		int[] a = new int[2];
		a[0] = 1;
		a[1] = 2;
		
		//第二种
		int[] b = new int[]{1,2};
		
		
		//第三种
		int[] c = {1,2};
		
		
		//第四种:变量定义方式不一样
		int d[] = {1,2};
		
		
		
		//转数组
		String cString = "方式不一样";
		char[] charArray = cString.toCharArray();
		for (char e : charArray) {
			System.out.println(e);
		}
		
	}
}
