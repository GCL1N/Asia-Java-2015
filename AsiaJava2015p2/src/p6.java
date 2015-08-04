import java.util.Scanner;
public class p6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
		System.out.println("請輸入土地面積 (單位為 '平方公尺')");
float a=scn.nextFloat();
double b=a*0.3025;

System.out.println("\n經過轉換後, "+a+" 平方公尺相當於 "+b+" 坪。");
System.out.println("請輸入每坪價錢");
float m=scn.nextFloat();
double tm=b*m;
System.out.println("此土地之總價格為 "+tm+" 元。");




	}

}
