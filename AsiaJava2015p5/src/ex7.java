//���� n * m �� ���k��
import java.util.Scanner ;
public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J N �� : ");
		int n = scn.nextInt();
		System.out.print("�п�J  M �� :  ");
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
