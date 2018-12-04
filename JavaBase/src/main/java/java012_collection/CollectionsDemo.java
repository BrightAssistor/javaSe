package java012_collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
	public static void main(String[] args) {
		ArrayList<String> nList = new ArrayList<String>();
		nList.add("jim");
		nList.add("Lucy");
		nList.add("Lily");
		nList.add("jack");
		nList.add("frank");
		nList.add("CP");
		
		System.out.println("*********操作前*************");
		for (String str : nList) {
			System.out.print(str+" ");
		}
		
		System.out.println("*********交换后*************");
		Collections.swap(nList, 2, 3);//指定下标进行交换
		for (String str : nList) {
			System.out.print(str+" ");
		}
		
		System.out.println("*********自然排序后*************");
		Collections.sort(nList);
		for (String str : nList) {
			System.out.print(str+" ");
		}
		
		System.out.println("*********填充后*************");
		Collections.fill(nList, "sol");
		for (String str : nList) {
			System.out.print(str+" ");
		}
	}
}














