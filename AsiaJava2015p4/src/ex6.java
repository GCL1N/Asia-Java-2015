//��J�@�X�k�T���Τ��T����A�P�w���T���ά� �w���A�U���άO�����C
import java.util.Scanner;
public class ex6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J ���X�k�T���Τ�A���");
		int a = scn.nextInt();
		System.out.println("�п�J ���X�k�T���Τ�B���");
		int b = scn.nextInt();
		System.out.println("�п�J ���X�k�T���Τ�C���");
		int c = scn.nextInt();
		  if((a * a) + (b * b) < (c*c)){
			  System.out.println("�g�L��K�p��A���T���ά� �w���T����");
		  }else{if((a * a) + (b * b) > (c*c)){
			  System.out.println("�g�L��K�p��A���T���ά� �U���T����");
		      }else{if((a * a) + (b * b) == (c*c)){
		    	  System.out.println("�g�L��K�p��A���T���ά� �����T����");
		          }
		       }   
		  }
    }
}