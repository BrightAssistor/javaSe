package java010_enum;

public class Enum2 {
	public static void main(String[] args) {
		System.out.println(Person.P1);
		Person[] persons = Person.values();
		
	}
}

//public static final Person P1 = new Pereson("山东潍坊",23);
enum Person{
	P1("山东青岛",23),P2("山东潍坊",23),P3("山东日照",23);
	private String name;
	private int age;
	
	private Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return name+"---"+age;
	}
}