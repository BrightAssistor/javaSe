package java014_swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegisterView extends JFrame {
	private JLabel jlb_name;// 标签：用户名
	private JLabel jlb_pwd;// 标签：密码
	private JTextField jtf_name;// 文本框：用户名
	private JTextField jtf_pwd;// 文本框：密码
	private JPanel jPanel1;// 容器：放置确定按钮上面的组件
	private JPanel jPanel2;// 容器：放置确定按钮
	private JButton jbtn_ok;// 按钮：确定

	// 构造方法
	public RegisterView(String title) {
		super(title);
		init();
		registerLis();
	}

	// 初始化
	public void init() {
		this.setSize(400, 300);
		GridLayout layout = new GridLayout(2, 2, 5, 5);

		// 创建基本组件
		jlb_name = new JLabel("用户名: ", JLabel.RIGHT);
		jlb_pwd = new JLabel("密码: ", JLabel.RIGHT);
		jtf_name = new JTextField();
		jtf_pwd = new JTextField();
		jPanel1= new JPanel();
		jPanel1.setLayout(layout);
		jPanel2= new JPanel();
		jbtn_ok = new JButton("确定");

		// 将创建的组件添加到对应的位置
		jPanel1.add(jlb_name);
		jPanel1.add(jtf_name);
		jPanel1.add(jlb_pwd);
		jPanel1.add(jtf_pwd);
		jPanel2.add(jbtn_ok);

		this.add(jPanel1,BorderLayout.CENTER);
		this.add(jPanel2,BorderLayout.SOUTH);
		this.setVisible(true);

	}

	// 注册监听
	public void registerLis() {

		jbtn_ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 获取输入的用户名和密码，存放到集合中
				
			}
		});

	}

}
