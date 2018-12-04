package java007_string;
public class indexOf {
	String name;
	int age;
	
	//显示个人信息
	public String showInfor(){
		return "我的名字叫："+name+",今年："+age+"岁";
	}
	
	//计数
	public int count(String src,String dst){
		int index = 0;//索引
		int num = 0;//次数
		
		index = src.indexOf(dst);//得到首次出现的索引
		System.out.println(index+"*************");
		while (index != -1) {//如果等于-1，则是没有查到dst字符串
			num++;
			index += dst.length();
			index = src.indexOf(dst, index);
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		indexOf employ = new indexOf();
		employ.name = "李四";
		employ.age = 35;
		System.out.println(employ.showInfor());
		String str = "朋友啊朋友,你是我最好的朋友";
		String cc = "朋友";
		System.out.println(cc+"出现次数："+employ.count(str, cc));
	}	
}
