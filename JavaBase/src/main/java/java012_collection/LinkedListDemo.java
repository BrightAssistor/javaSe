package java012_collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("zhangsan");
		list.add("lisi");
		list.add("wangwu");
		list.add("rose");
		list.add("mary");
		list.add("jack");
		
//		System.out.println(list.size());
//		System.out.println(list.removeFirst());
//		System.out.println(list.remove("lisi"));
		list.add(2, "qwe");//在下标2处添加qwe
		list.addFirst("aaa");
		list.addLast("bbb");
		for (String string : list) {
			System.out.println(string);
		}
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}
	}
}
