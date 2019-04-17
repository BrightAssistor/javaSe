package java012_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
//		HashMap<Student, String> hashMap = new HashMap<Student, String>();
//		hashMap.put(new Student("jay", 20), "张三");
//		hashMap.put(new Student("li", 30), "李四");
//		hashMap.put(new Student("rose", 20), "玫瑰");
//		hashMap.put(new Student("li", 30), "李四");
//		System.out.println(hashMap);
//		System.out.println(hashMap.size());
		HashMap<Object,Object> hashMap2 = new HashMap<>(20, 0.8f);
		Set<Object> keySet = hashMap2.keySet();
		Collection<Object> values = hashMap2.values();
		System.out.println(hashMap2.hashCode());
	}
}


class Student{
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}