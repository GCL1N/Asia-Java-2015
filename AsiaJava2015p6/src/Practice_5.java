//���h for-loop �d�ҽm��_5
import java.util.Scanner;
public class Practice_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
			for(int i = 0 ; i <= n ; i++  ){
				for(int j = 0 ; j < n - i  ; j++){
					System.out.print("��");
				}
				System.out.println();
			}
	}
}
