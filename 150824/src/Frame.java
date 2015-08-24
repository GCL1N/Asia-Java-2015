import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 class Frame extends JFrame{

	private Container cp ;
	private JTextField jtf = new JTextField("0");
	private JPanel jpnl1 = new JPanel();
	private JButton jbtns[] =  new JButton[9];
	
	public Frame(){
		initComp();
	}
	private void initComp(){
		this.setBounds(200,200,250,320);
		cp = this.getContentPane();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(new BorderLayout(5,5));
		jtf.setBackground(Color.gray);
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		jtf.setFont(new Font("Times New Roman",Font.BOLD,20));
		cp.add(jtf,BorderLayout.NORTH);
		
		jpnl1.setLayout(new GridLayout(3,3,3,3));
		cp.add(jpnl1,BorderLayout.CENTER);
		for(int i = 0 ; i <= 9 ; i++){
			jbtns[i]= new JButton(Integer.toString(i));
			jbtns[i].setOpaque(true);
			jbtns[i].setBackground(Color.pink);
			jbtns[i].setHorizontalAlignment(JButton.CENTER);
			jbtns[i].setFont(new Font("Times New Roman",Font.BOLD,18));
			jbtns[i].add(jbtns[i]);
			jbtns[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					JButton jbtn = (JButton)ae.getSource();
					jtf.setText(jbtn.getText());
				}
			});
		}
		
	}

}
