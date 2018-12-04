package java018_reflect;

import java.lang.reflect.Method;

public class ClassDemo {
	public static void main(String[] args) {
//		try {
//			Class<?> forName = Class.forName("java018_reflect.Student");
//			
//			Method[] methods = forName.getMethods();
//			for (Method method : methods) {
//				System.out.println(method.getName());
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("异常");
//			e.printStackTrace();
//		}
//		
//		System.out.println("******************************************");
//		Class clazz =Student.class;
//		Method[] methods = clazz.getMethods();
//		for (Method method : methods) {
//			System.out.println(method.getName());
//		}
		
		
		System.out.println("******************************************");
		Class<? extends Student> class1 = new Student().getClass();
		System.out.println(class1.getName());
		try {
			System.out.println(class1.getMethod("shut"));
			System.out.println(class1.getDeclaredMethod("shut"));
			System.out.println(class1.getField("name"));
			System.out.println(class1.getDeclaredField("name"));
			System.out.println(class1.getTypeParameters());
			System.out.println(class1.getName());
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
