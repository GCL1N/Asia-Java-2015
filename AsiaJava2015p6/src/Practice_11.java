//while-loop �d�ҽm��_2
import java.util.Scanner;
public class Practice_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�n�d�ߤ��~�� : ");
		int year = scn.nextInt();
		while(year%400 != 0 || year%4 != 0 && year%10 !=0){
			System.out.println("���~���O�|�~ ");
			System.out.print("�п�J�n�d�ߤ��~�� : ");
			 year = scn.nextInt();	
						
		}
		    System.out.print(year  +"�~�O�|�~��!");
	}

}
