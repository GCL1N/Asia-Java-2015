import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�T���Ϊ����a");
		float s1 = scn.nextFloat();
		System.out.println("�п�J�T���Ϊ����b");
		float s2 = scn.nextFloat();
		System.out.println("�п�J�T���Ϊ����c");
		float s3 = scn.nextFloat();
		  if(s1 <= s2 && s2<= s3 && s1 <= s3){
			  System.out.println("�����o�O�ӦX�k���T�������");
		  }else{
			  System.out.println("�����o�O�Ӥ��X�k���T�������");
		   }
	}
}
