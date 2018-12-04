package java007_string;

public class StringDemo {
	public static void main(String[] args) {
		String str = "hellow,my friend,you are my best friend";
		
		int length = str.length();//字符串长度
		System.out.println("长度："+length);
		System.out.println(str.charAt(5));//返回指定索引出的值
		System.out.println(str + "qwe");
		System.out.println(str);
		System.out.println(str.indexOf("m"));//指定内容首次出现的索引
		System.out.println(str.lastIndexOf("m"));//指定内容最后一次出现的索引
		//从指定索引出后指定内容首次出现的索引
		System.out.println(str.indexOf("m",8));
		//分割字符串
		String[] arr = str.split("m");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//截取字符串
		System.out.println(str.substring(3));
		System.out.println(str.substring(3,9));
		// 转换大小写
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
	}
}
