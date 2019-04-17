package java012_collection;

import java.util.TreeMap;

import com.sun.org.apache.regexp.internal.recompile;

public class TreeMapDemo {
	public static void main(String[] args) {
//		TreeMap<String, String> treeMap = new TreeMap<String, String>();
//		treeMap.put("jack", "zhangsan");
//		treeMap.put("fsfdf", "dfvdf");
//		treeMap.put("awe", "wang");
//		treeMap.put("asd", "cbdk");
//		System.out.println(treeMap);
		
		TreeMap<Person, String> treeMap = new TreeMap<Person, String>();
		treeMap.put(new Person("sol", 23), "zhang");
		treeMap.put(new Person("qwe", 35), "zhang");
		treeMap.put(new Person("asd", 32), "zhang");
		treeMap.put(new Person("sol", 2), "zhang");
		System.out.println(treeMap);
	}
}

class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		if (this.name.compareTo(o.name) > 0) {
			return 1;
		}else if(this.name.compareTo(o.name) < 0){
			return -1;
		}else {
			return this.age - o.age;
		}
	}
	
}







