import java.util.Scanner;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("��JA��");
		int a = scn.nextInt();
		System.out.println("��JB��");
		int b = scn.nextInt();
		int max = (a>b) ? a : b ;
		
		System.out.println("A��  "+a+" ,B��  "+b);
		System.out.println("���j�Ȭ�  "+max);

	}

}
