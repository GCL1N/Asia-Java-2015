import java.util.Scanner;
public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入A值");
		int a = scn.nextInt();
		System.out.println("輸入B值");
		int b = scn.nextInt();
		int max = (a>b) ? a : b ;
		
		System.out.println("A值  "+a+" ,B值  "+b);
		System.out.println("較大值為  "+max);

	}

}
