package java012_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("抢红包");
		arrayList.add("lisi");
		arrayList.add("wang");
		arrayList.add("wang");
		arrayList.add("zhang");
		arrayList.set(2, "1234");//替换
		System.out.println(arrayList.indexOf("wang"));//查找第一个出现wang的小标
		System.out.println(arrayList.remove("抢红包"));
		System.out.println(arrayList.remove(0));
		System.out.println(arrayList.contains("1234"));
		//arrayList.clear();
		System.out.println(arrayList.isEmpty());
		
//		//foreach循環
//		for (String s : arrayList) {
//			System.out.println(s);
//		}
//		
//		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.println(arrayList.get(i));
//		}
		
		//使用迭代器来遍历collection接口的容器
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
















