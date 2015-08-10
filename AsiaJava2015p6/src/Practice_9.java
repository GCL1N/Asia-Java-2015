//while-loop 範例練習_2
import java.util.Scanner;
public class Practice_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float n = 83.5f ;
		int m = 0;
		
			while( n > 60){
				System.out.print("此月他總共減了多少公斤? ");
				 int w = scn.nextInt();
				 n = n - w ;
				 m = m + 1 ;
			}
		System.out.print("他總共花了  " + m + " 個月，才減到60公斤以內。");
	}

}
