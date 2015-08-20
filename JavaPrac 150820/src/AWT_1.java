//建立List選擇表單
import java.awt.*;
public class AWT_1 extends Frame{
	static AWT_1 frm = new AWT_1();
	static List lst = new List();
			
		public static void main(String[] args) {
			frm.setLayout(new FlowLayout(FlowLayout.CENTER,10,25));
			frm.setTitle("選擇表單");
			for(int i = 0 ; i <= 9 ; i ++)
				lst.add("List Item" + i);
			lst.select(2);
			frm.setSize(200,150);
			frm.add(lst);
			frm.setBackground(Color.WHITE);
			frm.setVisible(true);
			System.out.println("lst.getRows()=  "+lst.getRows());
			System.out.println("lst.getItemCount()=  "+lst.getItemCount());
	}

}
