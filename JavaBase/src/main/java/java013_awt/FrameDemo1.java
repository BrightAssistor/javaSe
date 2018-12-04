package java013_awt;

import java.awt.Color;
import java.awt.Frame;

public class FrameDemo1 {
	public static void main(String[] args) {
		MyFram1 myFram1 = new MyFram1("放下屠刀立地成佛");
		//myFram1.init();
	}
}

class MyFram1 extends Frame{
	public MyFram1(String title){
		super(title);
		init();
	}
	
	//初始化
	public void init(){
		this.setSize(300, 300);//窗体宽和高
		this.setBackground(Color.GREEN);//背景顏色
		this.setVisible(true);//默认不可见，需要手动显示
	}
}
