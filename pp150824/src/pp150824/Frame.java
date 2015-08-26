package pp150824;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import javax.swing.Timer.*;
public class Frame extends JFrame{
	private JButton jbtnStart=new JButton("Start");
	private Container cp;
	private JTextField jtf=new JTextField("Time");
	private JPanel jpnl1=new JPanel();
	private JButton jbtns[]=new JButton[9];
	private int data[] = new int[9];
	private int n=0;
	Timer timer=new Timer(1000,new ActionListener(){
		public void actionPerformed(ActionEvent ae){
			jtf.setText("Time:"+(++n));
		}});
	private int count = 1;
	public Frame(){
		initComp();
	}
	private void initComp(){
		cp=this.getContentPane();
		this.setBounds(150,100,600,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(new BorderLayout(5,5));
		jtf.setBackground(Color.black);
		jtf.setHorizontalAlignment(JTextField.CENTER);
		jtf.setFont(new Font("Times New Roman",Font.BOLD,20));
		jtf.setEnabled(false);
		cp.add(jtf,BorderLayout.NORTH);
		
		jpnl1.setLayout(new GridLayout(3,3,3,3));
		cp.add(jpnl1,BorderLayout.CENTER);
		data = rndNum();
		for(int i=0;i<9;i++){
			jbtns[i]=new JButton(""+data[i]);
			jbtns[i].setOpaque(true);
			jbtns[i].setBackground(Color.pink);
			jbtns[i].setHorizontalAlignment(JButton.CENTER);
			jbtns[i].setFont(new Font("Times New Roman",Font.BOLD,25));
			jbtns[i].setForeground(Color.black);
			jbtns[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					JButton jbtn=(JButton)ae.getSource();
					if(count == Integer.parseInt(jbtn.getText())){
						count++;
						jbtn.setBackground(Color.pink);
						jbtn.setEnabled(false);
					}else{
						if(count != Integer.parseInt(jbtn.getText())){
							popFrame("�C������");
						}
						
					}
					
//					 if ((jbtn.getKeyCode() == KeyEvent.VK_ENTER)&&( jbtn.getID() == KeyEvent.KEY_PRESSED)  
//                             ) {  
//						 
//                     }
					
					if(count>9){
						timer.stop();
						popFrame(n+"��");
					}
				}
			});
			jpnl1.add(jbtns[i]);
		}
		jbtnStart.setBounds(50,100,0,0);
		cp.add(jbtnStart,BorderLayout.SOUTH);
		jbtnStart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				timer.start();
				for(int i=0;i<9;i++){
					jbtns[i].setBackground(Color.black);
				}
			}
		});
		
	}
	private void reset(){		//���s
		count=1;
		data = rndNum();
		for(int i=0;i<9;i++){
			jbtns[i].setText(""+data[i]);
			jbtns[i].setOpaque(true);
			jbtns[i].setBackground(Color.pink);
			jbtns[i].setForeground(Color.black);
			jbtns[i].setEnabled(true);
		}
		jtf.setText("Time");
		n=0;
		repaint();
		
		//timer.stop();
		//Stop Timer
	}
	private void popFrame(String message){
		timer.stop();
		JOptionPane.showMessageDialog(null,message);
		int n = JOptionPane.showConfirmDialog(null,
				"�z�O�_�~��?","���D", JOptionPane.YES_OPTION,JOptionPane.NO_OPTION,null);
			
		if(n == JOptionPane.YES_OPTION){
			for(int i=0;i<9;i++){
				reset();
			}//��l�ƹC�����~��i��
		}else{
			System.exit(0);	//�����C��
		}//���Ѯ���ܤp�����~��ε���
	}
	private int[] rndNum(){
		int i=0;
		Random rnd=new Random();
		boolean flag=false;
		int[] rnds = new int[9];
		while(i<9){
			rnds[i]=rnd.nextInt(9)+1;
			flag=false;
			for(int j=0;j<i;j++){
				if(rnds[i]==rnds[j]){
					flag=true;
				}
			}
			if(flag==false){
				i++;
			}
		}
		return rnds;
	}

}