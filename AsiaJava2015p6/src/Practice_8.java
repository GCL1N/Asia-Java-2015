//while-loop �d�ҽm��_1
import java.util.Scanner;

public class Practice_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = 0 ,b =0;
		String str = "Y";
		float result = 0.0f;
		
		while(str.equals("Y")||str.equals("y")){
			System.out.println("�п�JA��: ");
			 a = scn.nextInt();
			System.out.println("�п�JB��: ");
			 b = scn.nextInt();
			System.out.println("�п�J�����檺�B��: ");
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
			
			System.out.println("�g�L�p���  "+ a + op + b + " = " + result);
			System.out.println("�O�_�~������L�B��? (Y/N)");
		    str = scn.next();
		}
		
	}	
}
