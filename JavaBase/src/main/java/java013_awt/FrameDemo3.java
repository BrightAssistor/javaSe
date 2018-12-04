package java013_awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FrameDemo3 {
	public static void main(String[] args) {
		MyFrame3 myFrame3 = new MyFrame3("FlowLayout应用");
	}
}

class MyFrame3 extends Frame{
	public MyFrame3(String title){
		super(title);
		init();
	}
	
	//初始化
	public void init(){
		FlowLayout flowLayout = new FlowLayout();
		this.setLayout(flowLayout);
		
		this.setBackground(Color.BLUE);
		this.setBounds(200, 200, 400, 300);
		
		this.add(new Button("btn1"));
		this.add(new Button("btn2")); 
		this.add(new Button("btn3"));
		this.add(new Button("btn4"));
		
		this.setVisible(true);
	}
}





