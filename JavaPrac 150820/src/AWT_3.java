//建立Choice選擇表單
import java.awt.*;
public class AWT_3 extends Frame{
	static AWT_3 frm = new AWT_3();
	static Choice chc = new Choice();
	public static void main (String arg[]){
		frm.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		frm.setTitle("選擇Class");
		for(int i = 0; i <= 10; i++)
			chc.add("Choice Item  " + i);
		frm.add(chc);
		frm.setSize(200,150);
		frm.setBackground(Color.CYAN);
		frm.setVisible(true);
	}
}
