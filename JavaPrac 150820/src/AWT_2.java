//List選擇表單處理
import java.awt.*;
import java.awt.event.*;
public class AWT_2 extends Frame implements ItemListener{
	static AWT_2 frm = new AWT_2();
	static List lst = new List();
	public static void main (String args[]){
		frm.setLayout(new FlowLayout(FlowLayout.CENTER,10,25));
		frm.setTitle("選擇顏色");
		lst.add("Yellow");
		lst.add("Orange");
		lst.add("Pink");
		lst.add("Cyan");
		lst.addItemListener(frm);
		frm.add(lst);
		frm.setSize(200,150);
		frm.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e){
		String color = lst.getSelectedItem();
		if (color =="Yellow")
			frm.setBackground(Color.yellow);
		else if(color == "Orange")
			frm.setBackground(Color.orange);
		else if(color == "Pink")
			frm.setBackground(Color.pink);
		else if (color =="Cyan")
			frm.setBackground(Color.cyan);
		frm.setTitle("你選擇了  " + color);
	}
}
