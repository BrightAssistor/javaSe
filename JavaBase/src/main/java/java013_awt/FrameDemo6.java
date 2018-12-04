package java013_awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo6 {
	public static void main(String[] args) {
		MyFrame6 myFrame6 = new MyFrame6("卡片biubiu比u】");
	}
}

class MyFrame6 extends Frame{
	private Panel card_panel;//存放卡片
	private Panel control_panel;//存放按钮
	private CardLayout cardLayout;//卡片布局管理器
	private FlowLayout flowLayout;//流式布局管理器
	private Label lb_1,lb_2,lb_3,lb_4;//标签
	private TextField tf_content;//单行文本编辑框
	private Button btn_first,btn_previous,btn_next,btn_last;//按钮
	
	public MyFrame6(String title){
		super(title);
		init();
		registListener();
	}
	
	//初始化
	public void init(){
		//创建
		card_panel = new Panel();
		control_panel = new Panel();
		cardLayout = new CardLayout();
		flowLayout = new FlowLayout();
		//把布局管理器设置给对应的容器
		card_panel.setLayout(cardLayout);
		control_panel.setLayout(flowLayout);
		//创建标签
		lb_1 = new Label("第一页内容", Label.CENTER);
		lb_2 = new Label("第二页内容", Label.CENTER);
		lb_3 = new Label("第三页内容", Label.CENTER);
		lb_4 = new Label("第四页内容", Label.CENTER);
		//创建单行文本编辑框
		tf_content = new TextField();
		//创建按钮
		btn_first = new Button("第一张");
		btn_previous = new Button("上一张");
		btn_next = new Button("下一张");
		btn_last = new Button("最后一张");
		//把标签添加到卡片布局
		card_panel.add(lb_1);
		card_panel.add(lb_2);
		card_panel.add(lb_3);
		card_panel.add(lb_4);
		card_panel.add(tf_content);
		//把按钮添加到流式布局
		control_panel.add(btn_first);
		control_panel.add(btn_previous);
		control_panel.add(btn_next);
		control_panel.add(btn_last);
		//把两个容器添加到顶层容器中
		this.add(card_panel,BorderLayout.CENTER);
		this.add(control_panel,BorderLayout.SOUTH);
		this.setSize(400, 300);
		this.setVisible(true);
	}
	
	//注册监听
	public void registListener(){
		BtnListener listener = new BtnListener();
		btn_first.addActionListener(listener);
		btn_previous.addActionListener(listener);
		btn_next.addActionListener(listener);
		btn_last.addActionListener(listener);
		
		lb_1.addMouseMotionListener(new MouseAdapter() {

			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println(e.getX()+"--"+e.getY());
			}
			
		});
		
		this.addWindowListener(new WindowAdapter() {
			
		});
	}
	
	class BtnListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == btn_first) {
				cardLayout.first(card_panel);
			} else if (e.getSource() == btn_previous) {
				cardLayout.previous(card_panel);
			}else if (e.getSource() == btn_next) {
				cardLayout.next(card_panel);
			}else if (e.getSource() == btn_last) {
				cardLayout.last(card_panel);
			}
		}
		
	}
	
	
}






















