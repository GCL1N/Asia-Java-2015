import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J���a(ex:���Q�P,����p�E,�s�����E�E�E)");
		char[] shop = scn.next().toCharArray();
		System.out.println("�п�J����(ex:���,����,�C��,�@�ءE�E�E)");
		char[] drink = scn.next().toCharArray();
		System.out.println("�п�J����");
		int price = scn.nextInt();
		  if(shop[0] != '��' && shop[1] != '�Q' && shop[2] != '�P' ){
			  if(drink[0] == '��' || drink[0] == '�@'&& drink[1] == '��'  || drink[1] == '��' ){
				  if( price <= 45 ){System.out.println("�o�N���!�سǴN�R�o�@��!");
				  }else{ System.out.println("�����~ �o���O�L�R������,�ӶQ�o~");
				   }
			  }else{ System.out.println("�����~ �o���O�L�R������");
			   }
		  }else{ System.out.println("�����~ �L���R�o��"); 
		   }
	}
}


