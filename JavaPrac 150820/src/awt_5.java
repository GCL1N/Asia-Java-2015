import java.awt.*;
import java.awt.event.*;
public class awt_5 {
	static Frame frm = new Frame ("我的學號姓名");
	static Label lab = new Label ();
	
	public static void main (String args[]){
		
		frm.setLayout(null);
		frm.setSize(500, 400);
		frm.setBackground(Color.CYAN);
		frm.setLocation(249, 135);
		frm.add(lab);
		frm.setVisible(true);
		frm.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){System.exit(0);}});
		lab.setText("學號 : 104021018  姓名 : 林峻仕");
		lab.setBackground(Color.WHITE);
		lab.setAlignment(Label.CENTER);
		lab.setForeground(Color.blue);
		lab.setLocation(50, 160);
		lab.setSize(400,80);
		Font fnt = new Font("Serief",Font.ITALIC+Font.BOLD,18);
		lab.setFont(fnt);
		
	}
}



