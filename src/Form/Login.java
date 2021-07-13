package Form;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener
{
 private JTextField admintxt,contxt;
 private JPasswordField adminpass,conpass;
 private JButton alogin,clogin,csignup;
 private JPanel panel;
 private JLabel alabel,clabel,auser,apass,cuser,cpass;
 
 public Login()
 {
	 admintxt=new JTextField(15);
	 adminpass=new JPasswordField();
	 alogin=new JButton("LOGIN");
	 auser=new JLabel("ADMIN ID");
	 apass=new JLabel("PASSWORD");
	 	 
	 alabel=new JLabel();
	 alabel.add(admintxt);
	 alabel.add(adminpass);
	 alabel.add(auser);
	 alabel.add(apass);
	 alabel.add(alogin);

	 auser.setBounds(70, 50, 150, 20);
	 admintxt.setBounds(70, 70, 150, 20);
	 apass.setBounds(70, 100, 150, 20);
	 adminpass.setBounds(70, 120, 150, 20);
	 alogin.setBounds(100, 160, 75, 30);
	 
	 contxt=new JTextField(15);
	 conpass=new JPasswordField();
	 clogin=new JButton("LOGIN");
	 csignup=new JButton("SIGN UP");
	 cuser=new JLabel("CONSUMER ID");
	 cpass=new JLabel("PASSWORD");

	 clabel=new JLabel();
	 clabel.add(contxt);
	 clabel.add(conpass);
	 clabel.add(cuser);
	 clabel.add(cpass);
	 clabel.add(clogin);
	 clabel.add(csignup);
	 
	 cuser.setBounds(70, 50, 150, 20);
	 contxt.setBounds(70, 70, 150, 20);
	 cpass.setBounds(70, 100, 150, 20);
	 conpass.setBounds(70, 120, 150, 20);
	 clogin.setBounds(60, 160, 75, 30);
	 csignup.setBounds(155, 160, 85, 30);
	 
	 panel=new JPanel();
	 panel.setLayout(new GridLayout(1,2,50,50));
	 panel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	 
	 panel.add(alabel);
	 panel.add(clabel);
	 
	 alabel.setBorder(BorderFactory.createTitledBorder("ADMIN"));
	 clabel.setBorder(BorderFactory.createTitledBorder("CONSUMER"));
	 
	 add(panel);
	 
	 setSize(700,300);
	 setTitle("HOME PAGE");
	 setVisible(true);
	 setResizable(false);
	 
	 alogin.addActionListener(this);
	 clogin.addActionListener(this);
	 csignup.addActionListener(this);
	 	 
 }
 
 public void actionPerformed(ActionEvent e) 
 {
	if(e.getSource()==alogin)
	{
		JOptionPane.showMessageDialog(null, "Welcome", "Login Successful", ICONIFIED);
		Admin a1=new Admin();
		dispose();
	}
	else if(e.getSource()==clogin)
	{
		JOptionPane.showMessageDialog(null, "Welcome", "Login Successful", ICONIFIED);
		ConsumerLog a2=new ConsumerLog();
		dispose();
	}
	else if(e.getSource()==csignup)
	{
		JOptionPane.showMessageDialog(null, "Proceeding SignUp..", "SIGN UP", ICONIFIED);
		ConsumerSign a3=new ConsumerSign();
		dispose();
	}
 }
 
 public static void main(String[] args) 
 {
	Login a=new Login();
 }
 
}
