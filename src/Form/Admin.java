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

public class Admin extends JFrame implements ActionListener 
{
 private JButton create,update,delete,fetch;
 private JPanel panel;
 private JLabel label1,label2;
 
 public Admin()
 {
	 create=new JButton("CREATE NEW CONSUMER");
	 update=new JButton("UPDATE CONSUMER BILL");
	 delete=new JButton("DELETE CONSUMER");
	 fetch=new JButton("VIEW CONSUMER DETAILS");
	 
	 label1=new JLabel();
	 
	 label2=new JLabel();
	 label2.add(create);
	 label2.add(update);
	 label2.add(delete);
	 label2.add(fetch);
	 
	 create.setBounds(70, 50, 180, 30);
	 update.setBounds(70, 90, 180, 30);
	 delete.setBounds(70, 130, 180, 30);
	 fetch.setBounds(68, 170, 185, 30);
	 
	 label1.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
	 label2.setBorder(BorderFactory.createTitledBorder("ADMIN HOME PAGE"));
	 
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
	 
	 create.addActionListener(this);
	 update.addActionListener(this);
	 delete.addActionListener(this);
	 fetch.addActionListener(this);
 }
 
 public void actionPerformed(ActionEvent e) 
 {
	 if(e.getSource()==create)
		{
			Createsbmt a1=new Createsbmt();
			dispose();
		}
	 if(e.getSource()==update)
		{
			Updatesbmt a2=new Updatesbmt();
			dispose();
		}
	 if(e.getSource()==delete)
		{
			Deletesbmt a3=new Deletesbmt();
			dispose();
		}
	 if(e.getSource()==fetch)
		{
			Fetchsbmt a3=new Fetchsbmt();
			dispose();
		}

 }
 public static void main(String[] args) 
 {
	Admin b=new Admin();
 }
}
