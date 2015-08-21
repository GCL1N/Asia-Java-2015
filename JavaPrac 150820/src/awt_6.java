import java.awt.*;
import java.awt.event.*;
public class awt_6 {
	static Frame frm = new Frame();
	static Label lab = new Label();
	public static void main(String[] args) {
		frm.setLayout(null);
		frm.setSize(300, 300);
		frm.setLocation(300, 200);
		frm.setBackground(Color.black);
		frm.add(lab);
		frm.setVisible(true);
		lab.setText("歐齁(´⊙ω⊙`)");
		lab.setBackground(Color.white);
		lab.setForeground(Color.MAGENTA);
		lab.setAlignment(Label.CENTER);
		lab.setSize(150,150);
		lab.setLocation(80,80);
		Font fnt = new Font("標楷體",+Font.BOLD,16);
		lab.setFont(fnt);
		frm.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){System.exit(0);}});
	}
}
