package pp150824;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame{
	private Container cp ;
	private JTextField jtf = new JTextField("0");
	private JPanel jpnl1 = new JPanel();
	private JButton jbtns[] = new JButton[10];
	public Frame(){
		initComp();
	}
	private void initComp(){
		this.setBounds(500, 500, 250, 320);
		cp = this.getContentPane();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(new BorderLayout(5,5));
		jtf.setBackground(Color.WHITE);
		jtf.setEditable(false);
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		jtf.setFont(new Font("Times New Roman",Font.BOLD,20));
		cp.add(jtf, BorderLayout.NORTH);
		
		jpnl1.setLayout(new GridLayout(4,5,3,3));
		cp.add(jpnl1, BorderLayout.CENTER);
		for(int i = 1; i < 10; i ++){
			jbtns[i]= new JButton(Integer.toString(i));
			jbtns[i].setOpaque(true);
			jbtns[i].setBackground(Color.black);
			jbtns[i].setHorizontalAlignment(JLabel.CENTER);
			jbtns[i].setFont(new Font ("Times New Roman",Font.BOLD,18));
			jbtns[i].setFontColor(Color.black);
			jpnl1.add(jbtns[i]);
			
		}
	}
}
