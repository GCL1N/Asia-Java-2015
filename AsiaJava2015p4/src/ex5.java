//��J�@�Ӧr��,�Q��ASCII�X�P�_�O�j�g�A�p�g�A�Ʀr�r���A��L�r���C
import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�Ӧr��");
		char[] ch = scn.next().toCharArray();
		int chInt = (int)ch[0];
		  if(chInt >= 65 && chInt <= 90){
			  System.out.println("���r����  �j�g�r���A�� ASCII�X�� " + chInt);
		  }else{if(chInt >= 97 && chInt <= 122){
			  System.out.println("���r����  �p�g�r���A�� ASCII�X�� " + chInt);
		        }else{if(chInt >= 48 && chInt <= 57){
		        	System.out.println("���r����  �Ʀr�r���A�� ASCII�X�� " + chInt);
		         }else{
		        	System.out.println("���r����  ��L�r���A�� ASCII�X�� " + chInt);
		          }
		         }
		  }
	}
}
