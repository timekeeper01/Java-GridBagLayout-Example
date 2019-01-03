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
	
	public void actionPerformed(ActionEvent e) {//����ͬ�ļ����¼�
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
			JOptionPane.showMessageDialog(null,"Successful register��","��ʾ��Ϣ",JOptionPane.PLAIN_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null,"Failed register��","��ʾ��Ϣ",JOptionPane.PLAIN_MESSAGE);

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
	  {// ��֤�����������ʽ 
	   String format = "\\p{Alpha}\\w{2,15}[@][a-z0-9]{3,}[.]\\p{Lower}{2,}";
	   //p{Alpha}:�����Ǳ�ѡ�ģ�����ĸ�ַ�[\p{Lower}\p{Upper}]�ȼۡ��磺200896@163.com���ǺϷ��ġ�
	   //w{2,15}: 2~15��[a-zA-Z_0-9]�ַ���w{}�����Ǳ�ѡ�ġ� �磺dyh@152.com�ǺϷ��ġ�
	   //[a-z0-9]{3,}����������[a-z0-9]�ַ�,[]�ڵ��Ǳ�ѡ�ģ��磺dyh200896@16.com�ǲ��Ϸ��ġ�
	   //[.]:'.'��ʱ��ѡ�ģ� �磺dyh200896@163com�ǲ��Ϸ��ġ�
	   //p{Lower}{2,}Сд��ĸ���������ϡ��磺dyh200896@163.c�ǲ��Ϸ��ġ�
	   String mima="^[0-9]{4,4}$";
	   if ((email.getText()).matches(format)&&(password.getText()).matches(mima)){ 
		   status.setText("It is legal !");// �������Ϸ���status��ʾ�Ϸ�
		   return true;
	    }
	   else
	    {
		   status.setText("It is illegal !");// ���������Ϸ���status��ʾ���Ϸ�
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
		this.setLocationRelativeTo(null);//λ���м�
	}

}
