package java023_loadProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

/**
 * 读取jdbcinfo.properties文件，并获取该文件中的变量值
 * 
 * @author editor
 *
 */
public class ContextClassLoader {
	/**
	 * 资源配置文件
	 */
	public static final String DEFAULT_FILE = "jdbcinfo.properties";


	private static Logger logger = Logger.getLogger(ContextClassLoader.class);
	public static Properties properties = new Properties();

	static {
		try {
			String path = Thread.currentThread().getContextClassLoader().getResource("").getPath() + File.separator + DEFAULT_FILE;
			logger.info("文件加载路径：" + path);
			InputStream in = new FileInputStream(new File(path));
			properties.load(in);
			logger.info("resource_file.properties配置文件正常加载！");
		} catch (Exception e) {
			logger.error("读取配置resource_file.properties文件失败：" + e.getMessage());
		}
	}

	public static String getValueByKey(String key) {
		if (StringUtils.isBlank(key)) {
			return "";
		}
		return properties.getProperty(key);
	}
}
