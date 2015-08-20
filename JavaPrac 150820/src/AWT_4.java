//Choice選單事件處理
import java.awt.*;
import java.awt.event.*;

public class AWT_4 extends Frame implements ItemListener{
	static AWT_4 frm = new AWT_4();
	static Choice chc = new Choice();

	public static void main(String[] args) {
		BorderLayout br = new BorderLayout();
		frm.setLayout(br);
		frm.setTitle("選擇顏色");
		chc.add("Yellow");
		chc.add("Orange");
		chc.add("Pink");
		chc.add("Cyan");
		chc.addItemListener(frm);
		frm.setSize(200,150);
		frm.add(chc,br.NORTH);
		frm.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e){
		String color = chc.getSelectedItem();
		if(color == "Yellow")
			frm.setBackground(Color.yellow);
		else if(color == "Orange")
			frm.setBackground(Color.orange);
		else if(color == "Pink")
			frm.setBackground(Color.pink);
		else if (color == "Cyan")
			frm.setBackground(Color.cyan);
		frm.setTitle("你選擇了  " + color);
	}
}
