//while-loop �d�ҽm��_3
import java.util.Scanner;
public class Practice_12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float box = 30 ;
		float w = 20;
		float bmw = box * w;
		float atw = 0.0f;
		int a = 0;
			while(atw < bmw){
				System.out.print("�п�J�����s�����`�� : ");
				float tw = scn.nextInt();
				atw = atw + tw ;
			    a++ ;
			    System.out.println("�ثe�w�ֿn  " + atw +"  ��A��30�c�ٮt  "+ (bmw-atw) +"  ��C");
			}
		System.out.println("�w�˺�20�窺�c�l 30�c�F �C�`�@�O   "+ a + "  �ʾ�C");				
	}

}
