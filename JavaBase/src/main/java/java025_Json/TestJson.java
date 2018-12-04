package java025_Json;

import java.util.ArrayList;
import java.util.Arrays;

public class TestJson {
	/**
	 * alibaba的包可以直接使用转化工具
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Teacher> arrayList = new ArrayList<Teacher>();
		
		Teacher teacher0 = new Teacher();
		teacher0.setId(0);
		teacher0.setA(new int[]{1,2});
		Son son0 = new Son();
		son0.setId(10);
		teacher0.setSon(son0);
		
		Teacher teacher1 = new Teacher();
		Son son1 = new Son();
		son1.setId(20);
		teacher1.setSon(son1);
		teacher1.setId(1);
		teacher1.setA(new int[]{4,5});
		
		arrayList.add(teacher0);
		arrayList.add(teacher1);
		
		Student student = new Student();
		student.setId(0);
		student.setName("缴费单");
		student.setTeacher(arrayList);
		System.out.println(student);
		
		String obj2Json = JsonUtil.objectToJsonStr(student);
		System.out.println(obj2Json);
		Object jsonToObject = JsonUtil.jsonStrToObject(obj2Json, Student.class);
		System.out.println(jsonToObject);
		
		
	}
	


}
class Student{
	private int id;
	private String name;
	private java.util.List<Teacher> teacher;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public java.util.List<Teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(java.util.List<Teacher> teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", teacher=" + teacher + "]";
	}
	
}
class Teacher{
	private int id;
	private String type;
	private Son son;
	private int[] a;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Son getSon() {
		return son;
	}
	public void setSon(Son son) {
		this.son = son;
	}
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", type=" + type + ", son=" + son + ", a=" + Arrays.toString(a) + "]";
	}
	
}
class Son{
	private int id;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", type=" + type + "]";
	}
	
}