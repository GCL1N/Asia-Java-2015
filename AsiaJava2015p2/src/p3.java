import java.util.Scanner;
public class p3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("★歡迎使用超級懶人三角形面積計算機★");
System.out.println("請輸入三角形之 底(單位為 '公分' )");	
float a=scn.nextFloat();
System.out.println("請再輸入三角形之 高(單位為 '公分' )");
float h=scn.nextFloat();
float x=a*h/2;
System.out.println("經過嚴密計算後,此三角形面積為[ "+x+" ]平方公分");
System.out.println("~☆感謝您本次使用☆~" );
	}

}
