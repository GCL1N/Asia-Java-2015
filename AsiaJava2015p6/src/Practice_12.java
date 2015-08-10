//while-loop 範例練習_3
import java.util.Scanner;
public class Practice_12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float box = 30 ;
		float w = 20;
		float bmw = box * w;
		float atw = 0.0f;
		int a = 0;
			while(atw < bmw){
				System.out.print("請輸入此棵龍眼之總重 : ");
				float tw = scn.nextInt();
				atw = atw + tw ;
			    a++ ;
			    System.out.println("目前已累積  " + atw +"  斤，離30箱還差  "+ (bmw-atw) +"  斤。");
			}
		System.out.println("已裝滿20斤的箱子 30箱了 。總共是   "+ a + "  棵樹。");				
	}

}
