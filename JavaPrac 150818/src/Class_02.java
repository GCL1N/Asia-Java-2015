// unfinished
import java.util.*;
public class Class_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("＊＊＊＊＊＊歡迎光臨＊＊＊＊＊＊");
		Weapon wb = new Weapon("女人救世劍","878787");
		Weapon mb = new Weapon("男人野蠻劍","787878");
		String ans = "y";
		int wbn = 0;
		int mbn = 0;
		while(ans.equals("Y")||ans.equals("y")){		
			System.out.println("＊＊＊＊請輸入需要之商品＊＊＊＊");
			System.out.println("1.＊女人救世劍	單價：878,787＊");
			System.out.println("2.＊男人野蠻劍	單價：787,878＊");
			int stuff = scn.nextInt();
			switch(stuff){
			case 1:
				System.out.print("請問需要的數量為?");
				int numWb = scn.nextInt();
				wb.setNum(numWb);
				wbn++;
				break;			
			case 2:
				System.out.print("請問需要的數量為?");
				int numMb = scn.nextInt();
				wb.setNum(numMb);
				mbn++;
				break;
			default:
				System.out.println("抱歉,無此商品喔!請再確認。");
				break;
			}
			System.out.print("請問還需要其他商品嗎?(Y/N)");
			ans = scn.next();
		}
		System.out.println("請按下ENTER列印發票");
		try{
			System.in.read();
		}catch(Exception e){}
		System.out.println("			發票(亞洲資工店)				");
		System.out.println();
		System.out.println("台中市霧峰區柳豐路500號");
		System.out.println("電話:04-23323456 #6101");
		System.out.println("傳真:04-23233876");
		System.out.println("==============================================");
		System.out.println("品項名稱		單價	數量		小計");
		System.out.println("----------------------------------------------");
		if(wbn == 1){
			System.out.println("女人救世劍		878,787	"+wb.getNum()+"		"+wb.compute(878787,wb.getNum()));
		}
	}
}
class Weapon{
	private int num;	
	private String name;
	private String price;
	public  Weapon(String name1 , String price1){
		name = name1;
		price = price1;
	}
	public void setNum (int v1){
		num = v1;
	}
	public int getNum(){
		return num;
	}
	public float compute(float v1 , float v2){
		float result = v1 * v2;
		return result;
		
		
	}
}