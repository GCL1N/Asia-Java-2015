import java.util.Scanner;
public class p1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.print("請輸入攝氏溫度");
	float c = scn.nextFloat();
	float f = c*9/5+32;
	System.out.println("華氏溫度為"+f);

	}

}
