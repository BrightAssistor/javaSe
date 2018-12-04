package java013_awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;

public class FrameDemo5 {
	public static void main(String[] args) {
		MyFrame5 myFrame5 = new MyFrame5("GridLayout");
	}
}


class MyFrame5 extends Frame{
	public MyFrame5(String title){
		super(title);
		init();
	}
	
	//初始化
	public void init(){
		GridLayout gridLayout = new GridLayout(3, 2, 5, 5);
		this.setLayout(gridLayout);
		
		this.add(new Button("btn1"));
		this.add(new Button("btn2"));
		this.add(new Button("btn3"));
		this.add(new Button("btn4"));
		this.add(new Button("btn5"));
		
		this.setSize(400, 300);
		this.setVisible(true);
	}
}









