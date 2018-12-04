package java013_awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class FrameDemo2 {
	public static void main(String[] args) {
		MyFrame2 myFrame2 = new MyFrame2("panel容器");
	}
}

class MyFrame2 extends Frame{
	public MyFrame2(String title){
		super(title);
		init();
	}
	
	//初始化
	public void init(){
		//this.setSize(300, 300);//窗体宽和高
		this.setBounds(200, 200, 300, 300);
		this.setBackground(Color.GREEN);//背景顏色
		this.setLayout(null);//去除默認的布局管理器
		this.setVisible(true);//默认不可见，需要手动显示
		//按钮初始化
		Button btn1 = new Button("按钮");
		btn1.setBounds(20, 20, 100, 100);
		btn1.setBackground(Color.YELLOW);
		//panel初始化
		Panel panel = new Panel();
		panel.setBounds(0, 0, 200, 200);
		panel.setBackground(Color.RED);
		panel.setLayout(null);
		//添加到对应的位置
		panel.add(btn1);
		this.add(panel);
	}
}












