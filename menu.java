import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class menu
{
	private JFrame m1=new JFrame("Menu");
	private JButton bnew=new JButton("New Snake Game");
	private JButton bquit=new JButton("Quit");
	private JButton bsc=new JButton("Scores");
	public menu()
	{
		m1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
		m1.getContentPane().setLayout(new FlowLayout());
		m1.getContentPane().add(bnew);
		m1.getContentPane().add(bsc);
		m1.getContentPane().add(bquit);
		bnew.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
			m1.dispose();
			new Snake();
		}
		});
		bquit.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
			m1.dispose();
			new Library();
		}
		});
		m1.setSize(500,500);
		m1.setVisible(true);		
	}
	public static void main(String args[])
	{
		new menu();
	}
}

