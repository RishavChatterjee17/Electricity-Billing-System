package Form;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConsumerLog extends JFrame implements ActionListener 
{

	private JButton view,pay,contact;
	private JPanel panel;
	private JLabel label1,label2;
	
	public ConsumerLog()
	{
		view=new JButton("VIEW BILL DETAILS");
		pay=new JButton("PAY BILL");
		contact=new JButton("CONTACT ADMINISTRATOR");
		
		label1=new JLabel();
		
		label2=new JLabel();
		label2.add(view);
		label2.add(pay);
		label2.add(contact);
		
		view.setBounds(70, 50, 180, 30);
		pay.setBounds(70, 110, 180, 30);
		contact.setBounds(65, 170, 200, 30);
		
		label1.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		label2.setBorder(BorderFactory.createTitledBorder("CONSUMER HOME PAGE"));
		 
		 panel=new JPanel();
		 panel.setLayout(new GridLayout(1,2,50,50));
		 panel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		 panel.add(label1);
		 panel.add(label2);
		 
		 add(panel);
		 setSize(700,300);
		 setTitle("HOME PAGE");
		 setVisible(true);
		 setResizable(false);
		 
		 view.addActionListener(this);
		 pay.addActionListener(this);
		 contact.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
	}
	
	public static void main(String[] args) 
	{
		ConsumerLog c=new ConsumerLog();
	}

}
