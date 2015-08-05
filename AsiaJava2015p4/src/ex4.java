//輸入一個字元,將大寫轉小寫;小寫轉大寫。
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個字元");
		char[] a =scn.next().toCharArray();
		int aInt = (int)a[0];
		  if( aInt >= 65 && aInt <= 90){
			  System.out.println("此字元的小寫為 " + Character.toLowerCase(a[0]));
		  }else{
			  System.out.println("此字元的大寫為 " + Character.toUpperCase(a[0]));
		   }
	}
}
