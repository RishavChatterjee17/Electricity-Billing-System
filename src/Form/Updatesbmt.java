package Form;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Updatesbmt extends JFrame implements ActionListener
{
	private JLabel label,cidlabel;
	private JTextField cidtxt;
	private JButton submit,back;
	private JPanel panel;
	
	public Updatesbmt()
	{
		submit=new JButton("SUBMIT");
		back=new JButton("BACK");
		cidtxt=new JTextField(15);
		cidlabel=new JLabel("ENTER CID");
		
		label=new JLabel();
		label.add(cidlabel);
		label.add(cidtxt);
		label.add(submit);
		label.add(back);
		
		cidlabel.setBounds(30, 30,140,20);
		cidtxt.setBounds(100, 30,150,20);
		submit.setBounds(60, 70,80,30);
		back.setBounds(150, 70,80,30);
		
		panel=new JPanel();
		panel.setLayout(new GridLayout(1,1,50,50));
		panel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
		panel.add(label);
		
		add(panel);
		setSize(300,150);
		setTitle("UPDATE CONSUMER BILL");
		setVisible(true);
		setResizable(false);
		
		submit.addActionListener(this);
		back.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) 
	 {
		if(e.getSource()==submit)
		{
			
		}
		if(e.getSource()==back)
		{
			Admin b1=new Admin();
			dispose();
		}

	 }
	 public static void main(String[] args) 
	 {
		Updatesbmt e=new Updatesbmt();
	 }

}
