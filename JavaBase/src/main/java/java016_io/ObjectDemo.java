package java016_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Student student = new Student("�����", 400);
//		Student student2 = new Student("���w3��", 40);
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\student.txt"));
//		oos.writeObject(student);
//		oos.writeObject(student2);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\student.txt"));
		Student student2 = (Student)ois.readObject();
		Student student3 = (Student)ois.readObject();
		System.out.println(student2);
	}
}

class Student implements Serializable{
	private static final long serialVersionUID = 5494225672076878504L;
	private String name;
	private int age;
	private String sex;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}