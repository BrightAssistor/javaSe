package java014_swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginView extends JFrame {
	
	
	public static void main(String[] args) {
		new LoginView("登录界面");
	}
	
	private JLabel jlb_name;// 标签：用户名
	private JLabel jlb_pwd;// 标签：密码
	private JTextField jtf_name;// 文本框：用户名
	private JTextField jtf_pwd;// 文本框：密码
	private JButton jbtn_login;// 按钮：登录
	private JButton jbtn_regist;// 按钮：注册

	// 构造方法
	public LoginView(String title) {
		super(title);
		init();
		registerLis();
	}

	// 初始化
	public void init() {
		GridLayout layout = new GridLayout(3, 2, 5, 5);
		this.setLayout(layout);
		this.setSize(400, 300);

		// 创建基本组件
		jlb_name = new JLabel("用户名: ", JLabel.RIGHT);
		jlb_pwd = new JLabel("密码: ", JLabel.RIGHT);
		jtf_name = new JTextField();
		jtf_pwd = new JTextField();
		jbtn_login = new JButton("登录");
		jbtn_regist = new JButton("注册");

		// 将创建的组件添加到对应的位置
		this.add(jlb_name);
		this.add(jtf_name);
		this.add(jlb_pwd);
		this.add(jtf_pwd);
		this.add(jbtn_login);
		this.add(jbtn_regist);

		this.setVisible(true);
		
	}

	// 注册监听
	public void registerLis() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		jbtn_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 获取输入的用户名和密码，存放到集合中

			}
		});
		jbtn_regist.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 跳转到注册界面
				new RegisterView("注册界面");
				
			}
		});

	}

}
