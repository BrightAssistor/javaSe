package java012_collection;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args) {
		TreeMap<Person2, String> treeMap = new TreeMap<Person2, String>(
				new Comparator<Person2>() {

					@Override
					public int compare(Person2 o1, Person2 o2) {
						if (o1.getName().compareTo(o2.getName()) > 0) {
							return 1;
						}else if(o1.getName().compareTo(o2.getName()) < 0){
							return -1;
						}else {
							return o1.getAge() - o2.getAge();
						}
					}
		});
		
		treeMap.put(new Person2("sol", 23), "zhang");
		treeMap.put(new Person2("qwe", 35), "zhang");
		treeMap.put(new Person2("asd", 32), "zhang");
		treeMap.put(new Person2("sol", 2), "zhang");
		System.out.println(treeMap);
	}
}

class Person2{
	private String name;
	private int age;
	
	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
}