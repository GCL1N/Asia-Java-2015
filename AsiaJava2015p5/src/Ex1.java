//利用Switch Case讓使用者輸入星期，接著顯示該星期之英文。
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入星期(數字) : ");
		int d = scn.nextInt();
			switch(d)
			{
			case 1 :
				System.out.println("星期一的英文為 => Monday ");
				break;
			case 2 :
				System.out.println("星期二的英文為 => Tuesday ");
				break;
			case 3 :
				System.out.println("星期三的英文為 => Wednesday ");
				break;
			case 4 :
				System.out.println("星期四的英文為 => Thursday ");
				break;
			case 5 :
				System.out.println("星期五的英文為 => Friday ");
				break;
			case 6 :
				System.out.println("星期六的英文為 => Saturday ");
				break;
			case 7 :
				System.out.println("星期日的英文為 => Sunday ");
				break;
			default :
				System.out.println("請確認你是否輸入正確的星期數字 ");
				break;
			}
	}
}
