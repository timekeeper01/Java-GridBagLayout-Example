package homework12;
//点击颜色来回变化，center正中间,边框颜色，
/*
check判断输入的账号密码是否正确
color点一下换一个颜色
center点一下让窗口居中
status显示你光标位置的信息
check判断账号格式是否正确，密码是否是四位
about弹出新的窗口
 */

//使用Grid BagLayout布局
import javax.swing.*;
import java.awt.*;

public class Chuangkou extends JFrame{

	public	JMenu file;
	public	JMenu about;
	public	JPanel blank2;
	public	JButton checkinfo;
	public	JButton color;
	public	JButton center;
	public	JButton register;
	public	JTextField email;
	public	JPasswordField password;
	public	JTextField status;
	public	JTextArea blank3;
	public  JMenuBar br;
	public  JMenuItem exit;
	public  JMenuItem update;
	public  JMenuItem information;
	
	public Chuangkou() {
		init();
		this.setTitle("Hello World");
		this.pack();
		this.setSize(377,230);
		this.setVisible(true);
//		this.setBackground(Color.BLUE);//设置背景色为蓝色
//		this.getContentPane().setVisible(true);
		this.getContentPane().setBackground(Color.WHITE);
	//	this.setLocationRelativeTo(null);//位于中间
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void init() {
		file=new JMenu("File");
		about=new JMenu("About");
		blank2=new JPanel();
		email=new JTextField(15);
		password=new JPasswordField(15);
		register=new JButton("Register");
		checkinfo=new JButton("Check Info");
		color=new JButton("     Color     ");
		center=new JButton("    Center   ");
		status=new JTextField("stutas");
		blank3=new JTextArea();
		br=new JMenuBar();
		exit=new JMenuItem("Exit");
		update=new JMenuItem("Update");
		information=new JMenuItem("Information");
		
		GridBagLayout layout=new GridBagLayout();
		this.setLayout(layout);
		
		br.add(file);
		br.add(about);
		file.add(exit);
		about.add(update);
		about.add(information);
		this.setJMenuBar(br);
		this.add(blank2);
		this.add(new JLabel("Email"));
		this.add(email);
		this.add(checkinfo);
		this.add(new JLabel("Password"));
		this.add(password);
		this.add(color);
		this.add(register);
		this.add(center);
		this.add(blank3);
		this.add(status);
		
		GridBagConstraints s=new GridBagConstraints();
		s.fill=GridBagConstraints.NONE;
		s.gridwidth=0;
		s.weightx=0;
		s.weighty=0.6;
		layout.setConstraints(blank2, s);
		s.gridwidth=3;
		s.weightx=0;
		s.weighty=0;
		layout.setConstraints(new JLabel("Email"), s);
		s.gridwidth=2;
		s.weightx=0;
		s.weighty=0;
		layout.setConstraints(email, s);
		s.gridwidth=0;
		s.weightx=0;
		s.weighty=0;
		s.insets=new Insets(0,10,0,0);
		layout.setConstraints(checkinfo, s);
		s.gridwidth=3;
		s.weightx=0;
		s.weighty=0;
		layout.setConstraints(new JLabel("Password"), s);
		s.gridwidth=2;
		s.weightx=0;
		s.weighty=0;
		s.insets=new Insets(0,1,0,0);
		layout.setConstraints(password, s);
		s.gridwidth=0;
		s.weightx=0;
		s.weighty=0;
		s.insets=new Insets(0,10,0,0);
		layout.setConstraints(color, s);
		s.gridwidth=3;
		s.weightx=0;
		s.weighty=0;
		layout.setConstraints(register, s);
		s.gridwidth=0;
		s.weightx=0;
		s.weighty=0;
		s.insets=new Insets(0,10,0,0);
		layout.setConstraints(center, s);
		s.gridwidth=0;
		s.weightx=0;
		s.weighty=1;
		s.fill=GridBagConstraints.VERTICAL;
		layout.setConstraints(blank3, s);
		s.gridwidth=0;
		s.weightx=1;
		s.weighty=0;
		s.anchor = GridBagConstraints.SOUTH;
		s.insets=new Insets(0,0,0,0);
		s.fill=GridBagConstraints.HORIZONTAL;
		layout.setConstraints(status, s);
			
	}
		
}
