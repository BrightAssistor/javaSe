package java0999_temp;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Optional;
import java.util.Random;

public class Api18 {

	public static void main(String[] args) {
//		Random random = new Random();
//		random.ints().limit(10).forEach(System.out::println);
		
		
//		
//		Integer value1 = null;
//	      Integer value2 = new Integer(10);
//	        
//	      // Optional.ofNullable - 允许传递为 null 参数
//	      Optional<Integer> a = Optional.ofNullable(value1);
//	      System.out.println(a.toString());
		
		String source ="runoob?java8";
		try {
			
			String base64encodedString = Base64.getEncoder().encodeToString(source.getBytes("utf-8"));
			System.out.println("基本编码："+base64encodedString);
			byte[] decode = Base64.getDecoder().decode(base64encodedString);
			System.out.println("基本解码："+new String(decode,"utf-8"));
			
			
			String urlencodedString = Base64.getUrlEncoder().encodeToString(source.getBytes("utf-8"));
			System.out.println("url编码："+urlencodedString);
			byte[] decode2 = Base64.getUrlDecoder().decode(urlencodedString);
			System.out.println("url解码："+new String(decode2,"utf-8"));
			
			
			
			String mimeencodeToString = Base64.getMimeEncoder().encodeToString(source.getBytes("utf-8"));
			System.out.println("mime编码："+mimeencodeToString);
			byte[] decode3 = Base64.getMimeDecoder().decode(mimeencodeToString);
			System.out.println("mime解码："+new String(decode3,"utf-8"));
			
			
		} catch (UnsupportedEncodingException e) {
			System.out.println("基本编码：");
			System.out.println("基本解码：");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
