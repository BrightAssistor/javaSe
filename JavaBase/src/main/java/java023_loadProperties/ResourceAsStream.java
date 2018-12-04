package java023_loadProperties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ResourceAsStream {
	public static void main(String[] args) {
		Properties pro = new Properties();
		InputStream io = ResourceAsStream.class.getResourceAsStream("/java024_pathSummary/jdbcinfo.properties");
		try {
			pro.load(io);
			String a = pro.getProperty("oracle.driver");
			System.out.println(a);
		} catch (IOException e) {
			System.out.println("运行异常："+e);
		}
	}
}
