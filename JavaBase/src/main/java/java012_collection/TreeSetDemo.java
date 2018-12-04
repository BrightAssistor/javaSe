package java012_collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		//TreeSet<Bird> treeSet = new TreeSet<Bird>();
		TreeSet<Bird> treeSet = new TreeSet<Bird>(
				new Comparator<Bird>() {

					@Override
					public int compare(Bird o1, Bird o2) {
						if (o1.getName().compareTo(o2.getName()) > 0) {
							return 1;
						}else if (o1.getName().compareTo(o2.getName()) < 0) {
							return -1;
						}else {
							return o1.getAge() - o2.getAge();
						}
					}
				});
		treeSet.add(new Bird("小泉", 23));
		treeSet.add(new Bird("安倍晋三", 23));
		treeSet.add(new Bird("哈士奇", 3));
		treeSet.add(new Bird("安倍晋三", 23));
		System.out.println(treeSet.size());
	}
}

class Bird implements Comparable<Bird>{
	private String name;
	private int age;
	
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
	public Bird(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Bird o) {
		// TODO Auto-generated method stub
		if (this.name.compareTo(o.name) > 0) {
			return 1;
		}else if (this.name.compareTo(o.name) < 0) {
			return -1;
		}else {
			return this.age - o.age;
		}
	}
	
	
}
