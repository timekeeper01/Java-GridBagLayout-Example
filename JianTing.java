package homework12;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.*;

public class JianTing extends Chuangkou implements ActionListener{

	public JianTing() {
		exit.addActionListener(this);
		update.addActionListener(this);
		information.addActionListener(this);
		register.addActionListener(this);
		checkinfo.addActionListener(this);
		color.addActionListener(this);
		center.addActionListener(this);	
	
	}
	
	public void actionPerformed(ActionEvent e) {//处理不同的监听事件
		if(e.getActionCommand()=="Exit") {
			this.dispose();
		}
		if(e.getActionCommand()=="Update") {
			this.aboutUpdate();
		}
		if(e.getActionCommand()=="Information") {
			this.aboutInfo();
		}
		if(e.getActionCommand()=="Register") {
			try {
				register();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		if(e.getActionCommand()=="Check Info") {
			checkInfoEmail();
		}
		if(e.getActionCommand()=="     Color     ") {
			this.colorChange();
		}
		if(e.getActionCommand()=="    Center   ") {
			centerSet();
		}
		
	}
	
	public void aboutInfo() {
		JOptionPane.showMessageDialog(null,"author:Guo Minghui;  date:2018-12-15","Information",JOptionPane.PLAIN_MESSAGE);
	}
	
	public void aboutUpdate() {
		JOptionPane.showConfirmDialog(null, "update?", "choose one", JOptionPane.YES_NO_OPTION);
	}
	
	public void register() throws Exception {
		if(checkInfoEmail()==true) {
			WriteToFile(email.getText(),password.getText());
			JOptionPane.showMessageDialog(null,"Successful register！","提示消息",JOptionPane.PLAIN_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null,"Failed register！","提示消息",JOptionPane.PLAIN_MESSAGE);

		}
	}
	
	 public void WriteToFile(String str1,String str2) throws Exception {  
	        FileWriter fw = new FileWriter("D:\\JianTing.txt", true);  
	        BufferedWriter bw = new BufferedWriter(fw);  
	        bw.newLine();  
	        bw.write(str1+"\r\n");
	        bw.write(str2+"\r\n");
	        bw.close();  
	        fw.close();  
	  
	    }  

	public boolean checkInfoEmail()
	  {// 验证邮箱的正则表达式 
	   String format = "\\p{Alpha}\\w{2,15}[@][a-z0-9]{3,}[.]\\p{Lower}{2,}";
	   //p{Alpha}:内容是必选的，和字母字符[\p{Lower}\p{Upper}]等价。如：200896@163.com不是合法的。
	   //w{2,15}: 2~15个[a-zA-Z_0-9]字符；w{}内容是必选的。 如：dyh@152.com是合法的。
	   //[a-z0-9]{3,}：至少三个[a-z0-9]字符,[]内的是必选的；如：dyh200896@16.com是不合法的。
	   //[.]:'.'号时必选的； 如：dyh200896@163com是不合法的。
	   //p{Lower}{2,}小写字母，两个以上。如：dyh200896@163.c是不合法的。
	   String mima="^[0-9]{4,4}$";
	   if ((email.getText()).matches(format)&&(password.getText()).matches(mima)){ 
		   status.setText("It is legal !");// 邮箱名合法，status显示合法
		   return true;
	    }
	   else
	    {
		   status.setText("It is illegal !");// 邮箱名不合法，status显示不合法
		   return false;
	    }
	  } 
	
	public void colorChange() {
		if (this.getContentPane().getBackground()==Color.WHITE){
		this.getContentPane().setBackground(Color.BLUE);
		}
		else {
			this.getContentPane().setBackground(Color.WHITE);
		}
	}
	
	public void centerSet(){
		this.setLocationRelativeTo(null);//位于中间
	}

}
