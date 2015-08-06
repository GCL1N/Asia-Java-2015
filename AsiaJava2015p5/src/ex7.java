//產生 n * m 之 乘法表
import java.util.Scanner ;
public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入 N 值 : ");
		int n = scn.nextInt();
		System.out.print("請輸入  M 值 :  ");
		int m = scn.nextInt();
	
		int i , j ;
		 for(i = 1 ; i <= n ; i++) {
			
			 for(j = 1 ; j <= m ; j++ ) {
								 
				 System.out.print((i * j) + "  ");
			 }
			 System.out.println();
		 }
	}
}
