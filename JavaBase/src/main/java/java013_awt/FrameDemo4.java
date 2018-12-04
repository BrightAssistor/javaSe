package java013_awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class FrameDemo4 {
	public static void main(String[] args) {
		MyFrame4 myFrame4 = new  MyFrame4("BorderLayout");
	}
}

class MyFrame4 extends Frame{
	public MyFrame4(String title){
		super(title);
		init();
	}
	
	//初始化
	public void init(){
		this.setBackground(Color.YELLOW);
		this.add(new Button("btn1"),BorderLayout.NORTH);
		this.add(new Button("btn2"),BorderLayout.SOUTH);
		this.add(new Button("btn3"),BorderLayout.WEST);
		this.add(new Button("btn4"),BorderLayout.EAST);
		this.add(new Button("btn5"),BorderLayout.CENTER);
		
		this.setBounds(200, 200, 400, 300);
		this.setVisible(true);
	}
}
