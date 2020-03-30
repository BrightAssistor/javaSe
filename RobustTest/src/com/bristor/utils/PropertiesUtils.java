package com.bristor.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesUtils {
	private static PropertiesUtils instance = null;
	private static final Object lock = new Object();


	public Map<String, String> commonContains=null;
	public int port=0;
	public String ip=null;

	public PropertiesUtils() {
		commonContains = new HashMap<String,String>();
		loadProperties();
		getCommonValue();
	}
	public static PropertiesUtils getInstance() {
		if (instance == null) {
			synchronized (lock) {
				if (instance == null) {
					instance = new PropertiesUtils();
				}
			}
		}
		return instance;

	}
	private Map<String, String> loadProperties() {
		File file = new File(CommonConfigs.FILEPATH+CommonConfigs.FILENAME);
		FileInputStream in = null;
		Properties pro = new Properties();
		try {
			in = new FileInputStream(file);
			pro.load(in);
			Enumeration<?> names = pro.propertyNames();
			while(names.hasMoreElements()){
				String key = (String) names.nextElement();
				String value = (String) pro.get(key);
				commonContains.put(key, value);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return commonContains;
	}
	private void getCommonValue() {
		port = Integer.parseInt(commonContains.get("port"));
		ip = String.valueOf(commonContains.get("ip"));
	}

}
