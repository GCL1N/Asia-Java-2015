//while-loop 範例練習_2
import java.util.Scanner;
public class Practice_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入要查詢之年分 : ");
		int year = scn.nextInt();
		while(year%400 != 0 || year%4 != 0 && year%10 !=0){
			System.out.println("此年不是閏年 ");
			System.out.print("請輸入要查詢之年分 : ");
			 year = scn.nextInt();	
						
		}
		    System.out.print(year  +"年是閏年喔!");
	}

}
