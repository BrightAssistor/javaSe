package java012_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("jay", "张三");
		hashMap.put("jay", "李四");
		hashMap.put("rose", "小红");
		hashMap.put("mary", "山东省");
		hashMap.put("ary", "山东省");
		hashMap.put("ry", "山东省");
		System.out.println(hashMap);
		
		//获取其中的键
		Set<String> keySet = hashMap.keySet();
		for (String str : keySet) {
			System.out.println(str);
		}
		
		//获取其中的值
		Collection<String> values = hashMap.values();
		for (String string : values) {
			System.out.println(string);
		}
		
		//获取其中鍵的同時獲取值
		Set<String> keySet2 = hashMap.keySet();
		for (String str : keySet) {
			System.out.println(str+"---"+hashMap.get(str));
		}
		//通过获取hashmap中的Entry对象，来获取entry中封装的键和值
		Set<Entry<String,String>> entrySet = hashMap.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
	}
}











