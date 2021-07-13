package Form;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConsumerSign extends JFrame implements ActionListener
{
	private JLabel name,address,c_email,c_no,dob,c_id,label1,label2;
	private JTextField nametxt,addtxt,emailtxt,c_notxt,c_idtxt;
	private JComboBox dob1,dob2,dob3;
	private JButton submit;
	private JPanel panel;
	
	public ConsumerSign()
	{
		name=new JLabel("NAME");
		address=new JLabel("ADDRESS");
		c_email=new JLabel("EMAIL ID");
		c_no=new JLabel("CONATCT NO.");
		c_id=new JLabel("CONSUMER ID");
		dob=new JLabel("DATE OF BIRTH");
		nametxt=new JTextField(15);
		addtxt=new JTextField(15);
		emailtxt=new JTextField(15);
		c_notxt=new JTextField(15);
		c_idtxt=new JTextField(15);
		submit=new JButton("SUBMIT");
		
		dob1=new JComboBox();
		dob2=new JComboBox();
		dob3=new JComboBox();
		
		
		label1=new JLabel();
		label1.add(name);
		label1.add(address);
		label1.add(c_email);
		label1.add(c_no);
		label1.add(dob);
		label1.add(c_id);
		label1.add(nametxt);
		label1.add(addtxt);
		label1.add(emailtxt);
		label1.add(c_notxt);
		label1.add(c_idtxt);
		label1.add(dob1);
		label1.add(dob2);
		label1.add(dob3);
		label1.add(submit);
		
		label2=new JLabel();
		
		name.setBounds(35, 50, 150, 20);
		address.setBounds(35, 75, 150, 20);
		c_email.setBounds(35, 140, 150, 20);
		c_no.setBounds(35, 165, 150, 20);
		c_id.setBounds(35, 190, 150, 20);
		dob.setBounds(35, 220, 150, 20);
		nametxt.setBounds(135, 50, 150, 20);
		addtxt.setBounds(135, 75, 150, 60);
		emailtxt.setBounds(135, 140, 150, 20);
		c_notxt.setBounds(135, 165, 150, 20);
		c_idtxt.setBounds(135, 190, 150, 20);
		submit.setBounds(150, 250, 120, 40);
		dob1.setBounds(120, 215, 60, 30);
		dob2.setBounds(180, 215, 60, 30);
		dob3.setBounds(240, 215, 60, 30);
		
		label2.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		label1.setBorder(BorderFactory.createTitledBorder("CONSUMER SIGNUP"));
		
		panel=new JPanel();
		panel.setLayout(new GridLayout(1,2,50,50));
		panel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		panel.add(label2);
		panel.add(label1);
		
		add(panel);
		setSize(700,350);
		setTitle("SIGNUP PAGE");
		setVisible(true);
		setResizable(true);
		
		submit.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==submit)
		{
			JOptionPane.showMessageDialog(null, "REGISTRATION SUCCESSFUL...!", "THANK YOU", ICONIFIED);
			dispose();
		}
	}
	
	public static void main(String[] args) 
	{
		ConsumerSign d=new ConsumerSign();
	
	}
}
