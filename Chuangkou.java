package homework12;
//�����ɫ���ر仯��center���м�,�߿���ɫ��
/*
check�ж�������˺������Ƿ���ȷ
color��һ�»�һ����ɫ
center��һ���ô��ھ���
status��ʾ����λ�õ���Ϣ
check�ж��˺Ÿ�ʽ�Ƿ���ȷ�������Ƿ�����λ
about�����µĴ���
 */

//ʹ��Grid BagLayout����
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
//		this.setBackground(Color.BLUE);//���ñ���ɫΪ��ɫ
//		this.getContentPane().setVisible(true);
		this.getContentPane().setBackground(Color.WHITE);
	//	this.setLocationRelativeTo(null);//λ���м�
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
