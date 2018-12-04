package java012_collection;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("jack");
		hashSet.add("jim");
		hashSet.add("july");
		hashSet.add("jun");
		System.out.println(hashSet.add("jack"));
		System.out.println(hashSet.size());
		
		HashSet<Dog> hashSet2 = new HashSet<Dog>();
		Dog dog= new Dog("we", 10);
		hashSet2.add(dog);
		//hashSet2.add(dog);
		hashSet2.add(new Dog("wrgg", 10));
		hashSet2.add(new Dog("4325g", 10));
		hashSet2.add(new Dog("we", 10));
		System.out.println(hashSet2.size());
		hashSet2.remove(new Dog("4325g", 10));
		System.out.println(hashSet2.size());
	}
}


class Dog{
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		Dog other = (Dog) obj;
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
