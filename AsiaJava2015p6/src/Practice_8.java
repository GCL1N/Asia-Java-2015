//while-loop 範例練習_1
import java.util.Scanner;

public class Practice_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = 0 ,b =0;
		String str = "Y";
		float result = 0.0f;
		
		while(str.equals("Y")||str.equals("y")){
			System.out.println("請輸入A值: ");
			 a = scn.nextInt();
			System.out.println("請輸入B值: ");
			 b = scn.nextInt();
			System.out.println("請輸入欲執行的運算: ");
			char op = scn.next().charAt(0);
				if(op=='+'){
					 result= a + b;
				}
				if(op=='-'){
					 result= a - b;
				}
				if(op=='*'){
					 result= a * b;
				}
				if(op=='/'){
					 result= a / b;
				}
			
			System.out.println("經過計算後  "+ a + op + b + " = " + result);
			System.out.println("是否繼續執行其他運算? (Y/N)");
		    str = scn.next();
		}
		
	}	
}
