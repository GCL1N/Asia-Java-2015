//�Q��Switch Case���ϥΪ̿�J�P���A������ܸӬP�����^��C
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�P��(�Ʀr) : ");
		int d = scn.nextInt();
			switch(d)
			{
			case 1 :
				System.out.println("�P���@���^�嬰 => Monday ");
				break;
			case 2 :
				System.out.println("�P���G���^�嬰 => Tuesday ");
				break;
			case 3 :
				System.out.println("�P���T���^�嬰 => Wednesday ");
				break;
			case 4 :
				System.out.println("�P���|���^�嬰 => Thursday ");
				break;
			case 5 :
				System.out.println("�P�������^�嬰 => Friday ");
				break;
			case 6 :
				System.out.println("�P�������^�嬰 => Saturday ");
				break;
			case 7 :
				System.out.println("�P���骺�^�嬰 => Sunday ");
				break;
			default :
				System.out.println("�нT�{�A�O�_��J���T���P���Ʀr ");
				break;
			}
	}
}
