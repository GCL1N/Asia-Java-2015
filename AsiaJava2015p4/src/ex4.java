//��J�@�Ӧr��,�N�j�g��p�g;�p�g��j�g�C
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�Ӧr��");
		char[] a =scn.next().toCharArray();
		int aInt = (int)a[0];
		  if( aInt >= 65 && aInt <= 90){
			  System.out.println("���r�����p�g�� " + Character.toLowerCase(a[0]));
		  }else{
			  System.out.println("���r�����j�g�� " + Character.toUpperCase(a[0]));
		   }
	}
}
