import java.util.Scanner;
public class p5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("★歡迎使用超級懶人圓形面積計算機★");
System.out.println("請輸入 圓形之半徑(單位為 '公分' )");	
float r=scn.nextFloat();
double x=r*r*Math.PI;
System.out.println("經過嚴密計算後,此圓形面積為[ "+x+" ]平方公分");
System.out.println("~☆感謝您本次使用☆~" );
	}

}
