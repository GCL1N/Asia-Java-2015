//while-loop �d�ҽm��_2
import java.util.Scanner;
public class Practice_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float n = 83.5f ;
		int m = 0;
		
			while( n > 60){
				System.out.print("����L�`�@��F�h�֤���? ");
				 int w = scn.nextInt();
				 n = n - w ;
				 m = m + 1 ;
			}
		System.out.print("�L�`�@��F  " + m + " �Ӥ�A�~���60����H���C");
	}

}
