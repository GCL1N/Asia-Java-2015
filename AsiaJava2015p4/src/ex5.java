//輸入一個字元,利用ASCII碼判斷是大寫，小寫，數字字元，其他字元。
import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個字元");
		char[] ch = scn.next().toCharArray();
		int chInt = (int)ch[0];
		  if(chInt >= 65 && chInt <= 90){
			  System.out.println("此字元為  大寫字元，其 ASCII碼為 " + chInt);
		  }else{if(chInt >= 97 && chInt <= 122){
			  System.out.println("此字元為  小寫字元，其 ASCII碼為 " + chInt);
		        }else{if(chInt >= 48 && chInt <= 57){
		        	System.out.println("此字元為  數字字元，其 ASCII碼為 " + chInt);
		         }else{
		        	System.out.println("此字元為  其他字元，其 ASCII碼為 " + chInt);
		          }
		         }
		  }
	}
}
